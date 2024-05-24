package part11_Array;

public class Ch03_objarray_DeppCopy {
	//함수 멤버1
	public static void main(String [] args) {
			//객체가 용소로 구성된 배열의 깊은복사
			//객체를 전달 할 경우 주소를전달 하므로 얕은복사
			//>객체의 값을 추출하여 직접 값으로 전달 할 수 있도록 구현이 필요
		
		
		Book [] Books = new Book[] {new Book("삼국지1","경비석"),new Book("삼국지2","나관중"),new Book("삼국지3","석비관")};
		
		Books[0].showBookInfo();
		
		Book[] Books_Backup = new Book[Books.length];
	
		System.arraycopy(Books, 0, Books_Backup, 0, 3);
		System.out.println(Books_Backup[0]); //객체를 할당 하지 않아 null상태
		System.out.println(Books[0]);
		
		Books_Backup[0].setTitle("java 프로그래밍");
		Books_Backup[0].setAuthor("한빛");
		
		
		Book[] Books_Backup2 = new Book[Books.length]; //백업받을 배열 객체 시트 생성
		Books[0].showBookInfo();
		MyObjDeppCopy(Books_Backup, 0, Books_Backup, 0, 0);
		
		MyObjDeppCopy(Books_Backup, 0, Books_Backup2, 0, Books.length);
		
		
		Books_Backup2[0].setTitle("MYSQL");
		Books_Backup2[0].setAuthor("금성당");
		
		Books[0].showBookInfo();
		Books_Backup2[0].showBookInfo();
		
	
	}
	
	//함수 멤버2
			private static void MyObjDeppCopy(Book[] _OriArray, int _iOriStart, Book[] _BackArray, int _iBackStart, int _iCount){
				for (; _iOriStart < _iCount ; _iOriStart++)
				{
					_BackArray[_iBackStart]=new Book();
					_BackArray[_iBackStart].setAuthor(_OriArray[_iOriStart].getAuthor());
					_BackArray[_iBackStart].setTitle(_OriArray[_iOriStart].getTitle());
				}
			}
		
}
