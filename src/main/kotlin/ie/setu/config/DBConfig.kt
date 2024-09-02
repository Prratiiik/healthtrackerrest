package ie.setu.config
import ie.setu.domain.db.*
import mu.KotlinLogging
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.name
import org.jetbrains.exposed.sql.transactions.transaction
import java.sql.DriverManager




class DbConfig{

    private val logger = KotlinLogging.logger {}

    //NOTE: you need the ?sslmode=require otherwise you get an error complaining about the ssl certificate
    fun getDbConnection() :Database{

        logger.info{"Starting DB Connection..."}

        val dbConfig = Database.connect(
            /*"jdbc:postgresql://lucky.db.elephantsql.com:5432/eflinqga?sslmode=require",*/
           "jdbc:postgresql://manny.db.elephantsql.com:5432/olvgnvwq",
            driver = "org.postgresql.Driver",
            user = "olvgnvwq",
            password = "7XJN4W1TDfuT9Dx0mA0TBEOcyYU6CSWF"
        )
       /* val url = "jdbc:postgresql://manny.db.elephantsql.com:5432/olvgnvwq"
        val user = "olvgnvwq"
        val password = "7XJN4W1TDfuT9Dx0mA0TBEOcyYU6CSWF"*/

        /*val conn: Connection = DriverManager.getConnection(url, user, password)*/


        transaction{
            SchemaUtils.createMissingTablesAndColumns(Users,Activities, BloodPressures,Runings,Temperatures)
        }

        logger.info{"DbConfig name = " + dbConfig.name}
        logger.info{"DbConfig url = " + dbConfig.url}

        return dbConfig
    }

}