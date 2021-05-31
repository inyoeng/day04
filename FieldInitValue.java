package co.yedam.test;

import java.util.Arrays;

public class FieldInitValue {
	
	/*
	 * 기본데이터형 타입은 기본값은 0으로 초기화
	 */
			
	
	byte bytefield;
	short shortfield;
	int intfield;
	long longfield;
	
	boolean booleanfield;
	char charfield;
	
	float floatfield;
	double doublefield;
	
	int[] arrfield;
	String referenceField;
	
	//기본생성자
	FieldInitValue() {}
	
	
	//int와 double 만들어주는 생성자 만들기
	
	FieldInitValue(int a, double b){
		intfield = a;
		doublefield = b;
	}
	
	@Override
	public String toString() {
		return "FieldInitValue [bytefield=" + bytefield + ", shortfield=" + shortfield + ", intfield=" + intfield
				+ ", longfield=" + longfield + ", booleanfield=" + booleanfield + ", charfield=" + charfield
				+ ", floatfield=" + floatfield + ", doublefield=" + doublefield + ", arrfield="
				+ Arrays.toString(arrfield) + ", referenceField=" + referenceField + "]";
	}
}
