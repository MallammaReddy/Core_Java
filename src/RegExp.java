import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String regexPattern = 	"(^(\\d+)\\.(\\d+)\\.(\\d+)$)|^(\\d+)\\.(\\d+)\\((\\d+)\\)(.*)$|(^(\\d+)\\.(\\d+)\\((\\d+)\\.(\\d+)\\)(.*)$)";
		
		//String regexPattern = 	"(^(\\d+)\\.(\\d+)\\((\\d+)\\.(\\d+)\\)(.*)$)";
		Pattern pattern = Pattern.compile(regexPattern);
		//Matcher matcher = pattern.matcher("7.0(3)I4(6)");--8.2(0.46)S0
		Matcher matcher = pattern.matcher("8.2(0)SK(0.162)");//8.2(0)SK(0.79),8.2(1)
		
		
		System.out.println(matcher.find());
	}

}
