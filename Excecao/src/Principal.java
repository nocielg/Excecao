
public class Principal {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a(100);
		System.out.println("terminando a execucao de main()");
	}
	
	public static void a(int i){
		System.out.println("executando a() com "+i);
		try {
			b(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("tratando a excecao"+e.getMessage());
		}
		System.out.println("terminando execucao de a()");
	}
	
	public static void b(int i) throws Exception{
		System.out.println("executando b() com "+i);
		throw new Exception("mensagem");
	} 

}
