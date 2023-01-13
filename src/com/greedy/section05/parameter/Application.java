package com.greedy.section05.parameter;

public class Application {

	public static void main(String[] args) {

		ParameterTest pt = new ParameterTest();
		pt.primitiveTypeParameter(20);
		
		int[]iarr= new int[] {1,2,3,4,5};
		System.out.println("인자로 전달받는 값 : " + iarr);
		pt.primitiveTypeArrayParameter(iarr);

		for(int i=0;i<iarr.length;i++) {
			System.out.print(iarr[i]+" ");
		}
		System.out.println();
	
		RectAngle r1 = new RectAngle(12.5,22.5);
		System.out.println("인자로 전달하는 값 : " + r1);
		pt.classTypeParameter(r1);
		
		System.out.println("변경 후 Application에서 사각형의 넓이와 둘레 ===============");
		r1.calcArea();
		r1.calcRound();
		
		pt.variableLengthArrayParameter("홍길동");
		pt.variableLengthArrayParameter("유관순", "볼링");
		pt.variableLengthArrayParameter("이순신","볼링","축구","당구");
		pt.variableLengthArrayParameter("신사임당", new String[] {"테니스","서예","떡썰기"});
	}

}
