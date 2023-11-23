package com.jap.marksevaluation;
public class OakBridgeSchool 
{
    public int[] calculateTotalMarks(int[] math,int science[],int[] english)
   
	if (math.length == 0 || science.length == 0 || english.length == 0) 
        return null;

        int[] totalMarks = new int[math.length];
        for (int i=0; i<math.length; i++) {
            totalMarks[i] = math[i] + science[i] + english[i];
        }
        return totalMarks;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int[] totalMarks, int noOfSubjects)
	{
		if (totalMarks.length == 0 || noOfSubjects == 0) 
		return null;

        int[] averageMarks = new int[totalMarks.length];
        for (int i = 0; i<totalMarks.length; i++) 
		{
            averageMarks[i] = totalMarks[i] / noOfSubjects;
        }
        return averageMarks;
    }


    public int calculateAverageScienceMarks(int[] science) {
		if (science.length == 0) 
        return -1; 
        
        int sum = 0;
        for (int i=0;i<science.length;i++)
		{
			sum=sum+science[i];
        }
        return  sum / science.length;
		}

    public int calculateAverageEnglishMarks (int[] english)
    {
		if (english.length == 0) {
            return -1; 
        }
		 int sum = 0;
        for (int i=0;i<english.length;i++)
		{
            sum=sum+english[i];
        }
        return  sum / english.length;
    }


    public int calculateAverageMathMarks (int[] math) 
	{
		if (math.length == 0) {
            return -1; 
        }
		int sum = 0;
        for (int i=0;i<math.length;i++)
		{
            sum=sum+math[i];
        }
        return  sum / math.length;
	}

    public static void main(String[] args) {
	    OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        int [] math = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int [] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int [] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
		int noOfSubjects = 3;
        String[] studentNames = {"Michelle", "Kate", "Dravid", "Tina", "Tom", "Sam", "Ria", "Pam",			"Leena","Leo"};
		int [] rollNos = {102, 109, 101, 103, 104, 108, 110, 105, 106, 107};
        int [] totalMarks = oakBridgeSchool.calculateTotalMarks(math,science,english);
        int [] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks,				noOfSubjects);
        
        int averageScienceMarks = oakBridgeSchool.calculateAverageScienceMarks(science);
        int averageMathMarks = oakBridgeSchool.calculateAverageMathMarks(math);
        int averageEnglishMarks = oakBridgeSchool.calculateAverageEnglishMarks(english);

        // Display the average marks scored by the class in subjects
		System.out.println("Average Science Marks: " + averageScienceMarks);
        System.out.println("Average Math Marks: " + averageMathMarks);
        System.out.println("Average English Marks: " + averageEnglishMarks);

    }
}
