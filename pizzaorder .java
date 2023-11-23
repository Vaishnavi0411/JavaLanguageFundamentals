import java.util.Scanner;
public class WeightedAverage {
    public float calculateWeightedAverage(float assignmentWeight, float projectWeight, float 				quizWeight,float midTermWeight, float finalExamWeight, float assignmentScore, float 				projectScore,	 float quizScore,float midTermScore, float finalExamScore) 
	{
		float assignmentPercentageScore = (assignmentWeight / 100.0f) * assignmentScore;
        float projectPercentageScore = (projectWeight / 100.0f) * projectScore;
        float quizPercentageScore = (quizWeight / 100.0f) * quizScore;
        float midTermPercentageScore = (midTermWeight / 100.0f) * midTermScore;
        float finalExamPercentageScore = (finalExamWeight / 100.0f) * finalExamScore;

		System.out.format("%-20s %-20s\n", "Weights", "% Value of score");
		System.out.format("%-20s %-20.1f\n", "Assignments", (assignmentPercentageScore));
		System.out.format("%-20s %-20.6f\n", "Projects", (projectPercentageScore ));
		System.out.format("%-20s %-20.1f\n", "Quizzes", (quizPercentageScore));
		System.out.format("%-20s %-20.2f\n", "Mid term", (midTermPercentageScore));
		System.out.format("%-20s %-20.1f\n", "Final Exam", (finalExamPercentageScore));
		
		float overallPercentage = assignmentPercentageScore + projectPercentageScore
                + quizPercentageScore + midTermPercentageScore + finalExamPercentageScore;
		return overallPercentage;
    }

    public static void main(String[] args) 
	{
		WeightedAverage Obj = new WeightedAverage();
		float assignmentWeight;
		float projectWeight;
		float quizWeight;
		float midTermWeight;
		float finalExamWeight;
		float assignmentScore;
		float projectScore;
		float quizScore;
		float midTermScore;
		float finalExamScore;
		float weightedAverage;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter assignment weight : ");
        assignmentWeight = scanner.nextFloat();

        System.out.println("Enter project weight: ");
        projectWeight = scanner.nextFloat();

        System.out.println("Enter quiz weight: ");
        quizWeight = scanner.nextFloat();

        System.out.println("Enter mid-term weight: ");
        midTermWeight = scanner.nextFloat();

        System.out.println("Enter final exam weight: ");
        finalExamWeight = scanner.nextFloat();
		
		System.out.println("Enter assignment score: ");
        assignmentScore = scanner.nextFloat();

        System.out.println("Enter project score: ");
        projectScore = scanner.nextFloat();

        System.out.println("Enter quiz score: ");
        quizScore = scanner.nextFloat();

        System.out.println("Enter mid-term score: ");
        midTermScore = scanner.nextFloat();

        System.out.println("Enter final exam score: ");
        finalExamScore = scanner.nextFloat();
		
		weightedAverage = Obj.calculateWeightedAverage(assignmentWeight, projectWeight, 					quizWeight, midTermWeight, finalExamWeight, assignmentScore, projectScore, quizScore, 				midTermScore, finalExamScore);
		System.out.println("The weighted average score is "+ weightedAverage +"%");
		scanner.close();
    }
}