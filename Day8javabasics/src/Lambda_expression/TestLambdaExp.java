package Lambda_expression;

public class TestLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* case1: LambdaInterface lmb=(X, DEPT_name)->{
			System.out.println(X+" "+DEPT_name);
		};
		lmb.lambda(80,"LKM");
		case2: */
		
		LambdaInterface lambdaInterface=(int A, int B, int C)->(A+B+C); //create instance specify values of same type
		System.out.println(lambdaInterface.calc(100, 200, 300));

	}

}
