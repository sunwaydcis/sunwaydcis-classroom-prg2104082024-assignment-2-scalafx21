import scala.io.Source

// Define global variables
final val filePath = "./res/hospital_assignment.csv"
// Define storage for Hospital Data
var hospitalData: List[List[String]] = List()
// Identify derived value in the csv
// 7th index value - on the columns in the csv, drop, total_admitted is derived value
// 10th index valye - on the columns in the csv, drop, discharge_total is derived value
val columnIndexToDrop : List[Int] = List(7,10)

// Function to read CSV and count records
def readCSV(): List[List[String]] = {
  // Open the CSV file
  val bufferedSource = Source.fromFile(filePath)
  var data: List[List[String]] = List()
  var count = 0

  // read each line, dropping the header
  for (line <- bufferedSource.getLines().drop(1)) { // Drop header line
    val cols = line.split(",").map(_.trim).toList
    data = data :+ cols
    count += 1
  }

  bufferedSource.close()
  println("Total amount of hospitals in the file: $count")
  data
}

// Main function to run the program
@main def main(): Unit = {
  // Load data from CSV into global hospitalData
  hospitalData = readCSV()

  //sort the hospital data into

}