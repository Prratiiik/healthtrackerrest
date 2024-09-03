package ie.setu.helpers

import ie.setu.domain.Activity
import ie.setu.domain.User
import ie.setu.domain.db.Activities.calories
import ie.setu.domain.db.Activities.id
import org.joda.time.DateTime

val nonExistingEmail = "112233445566778testUser@xxxxx.xx"
val validName = "Test User 1"
val validEmail = "testuser1@test.com"

val users = arrayListOf<User>(
    User(name = "Roger", email = "roger@setu.com", id = 1, password = ""),
    User(name = "Alice", email = "alice@setu.ie", id = 2, password = ""),
    User(name = "John", email = "john@gmail.com", id = 3, password = ""),
    User(name = "Steve", email = "steve@apple.com", id = 4, password = "")
)

val activities = arrayListOf<Activity>(
    Activity(calories = "10", activityName = "Task1", id = 1, userId = 1, createdAt = DateTime.now()),
    Activity(calories = "20", activityName = "Task2", id = 2, userId = 2, createdAt = DateTime.now()),
    Activity(calories = "30", activityName = "Task3", id = 3, userId = 3, createdAt = DateTime.now())

)

val bloodPressureActivities = arrayListOf<BloodPressure>(
    BloodPressure(pulse = 72, systolic = 120, diastolic = 80, userId = 1, createdAt = DateTime.now(),id=1),
    BloodPressure(pulse = 72, systolic = 120, diastolic = 80, userId = 1, createdAt = DateTime.now(),id=2),
    BloodPressure(pulse = 72, systolic = 120, diastolic = 80, userId = 1, createdAt = DateTime.now(),id=3),
)

val runningAcitivities = arrayListOf<Running>(
    Running(id=1, distance = 25, calories = 150, userId = 1, createdAt = DateTime.now()),
    Running(id = 1, distance = 25, calories = 150, userId = 1, createdAt = DateTime.now()),
    Running(id = 1, distance = 25, calories = 150, userId = 1, createdAt = DateTime.now())
)

val temperatureActivities = arrayListOf<Temperature>(
    Temperature(id = 1, temperature = "97.0".toFloat(), userId = 1, createdAt = DateTime.now()),
    Temperature(id = 1, temperature = "98.0".toFloat(), userId = 1, createdAt = DateTime.now()),
    Temperature(id = 1, temperature = "99.0".toFloat(), userId = 1, createdAt = DateTime.now()),


    )