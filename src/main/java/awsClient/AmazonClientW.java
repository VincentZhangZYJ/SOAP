package awsClient;

public class AmazonClientW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<1){
			return;
		}
		final String access_key=args[0];
		AWSECommerceService service=new AWSECommerceService();
		AWSECommerceServicePortType port=service.getAWSECommerceServicePort();
	}

}
