package in.tekleads.book.types;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface = "in.tekleads.book.types.EBookService")
@HandlerChain(file ="handler-chain.xml")
public class BookServiceImpl implements EBookService {
 public BookServiceImpl() {
	 System.out.println("Book Service Impl is executed");
 }
	
	@Override
	public BookResponseType getBookByIsbn(BookRequestType parameter) {
		System.out.println("GetBookByIsbn is executed");
		
			String isbn=parameter.getBookIsbn();
		
		BookResponseType responseType=new  BookResponseType();
		responseType.setBookIsbn(isbn);
		responseType.setCategory("Java");
		responseType.setBookName("Spring With Reactive");
		responseType.setAuthor("Mr.Ashok sir");
		responseType.setPrice(400.00);
		return responseType;
	}

	
}
