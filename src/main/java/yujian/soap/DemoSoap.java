package yujian.soap;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.Name;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;

public class DemoSoap {
	private static final String LocalName="TimeRequest";
	private static final String Namespace="http://yujian/mysoap";
	private static final String NamespacePrefix="ms";
	private ByteArrayOutputStream out;
	private ByteArrayInputStream in;
	public static void main(String[] args){
		new DemoSoap().request();
	}
	private void request(){
		try {
			SOAPMessage msg=create_soap_message();
			SOAPEnvelope env=msg.getSOAPPart().getEnvelope(); 
			SOAPHeader hdr=env.getHeader();
			Name lookup_name=create_qname(msg);
			hdr.addHeaderElement(lookup_name).addTextNode("time_request");
			out=new ByteArrayOutputStream();
			msg.writeTo(out);
			trace("The sent soap Message:",msg);
			SOAPMessage response=process_request();
			extract_contents_and_print(response);
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private SOAPMessage process_request() {
		// TODO Auto-generated method stub
		process_incoming_soap();
		coordinate_streams();
		return create_soap_message(in);
	}
	private SOAPMessage create_soap_message(ByteArrayInputStream in) {
		// TODO Auto-generated method stub
		SOAPMessage msg=null;
		try {
			MessageFactory mf=MessageFactory.newInstance();
			msg=mf.createMessage(null,in);
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			System.err.print(e);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
		
	}
	private void coordinate_streams() {
		// TODO Auto-generated method stub
		in=new ByteArrayInputStream(out.toByteArray());
		out.reset();
		
	}
	private void process_incoming_soap() {
		// TODO Auto-generated method stub
		try {
			coordinate_streams();
			SOAPMessage msg=create_soap_message(in);
			Name lookup_name=create_qname(msg);
			SOAPHeader header=msg.getSOAPHeader();
			Iterator it=header.getChildElements(lookup_name);
			Node next=(Node)it.next();
			String value=(next==null)?"Error":next.getValue();
			if(value.toLowerCase().contains("time_request")){
				String now=new Date().toString();
				SOAPBody body=msg.getSOAPBody();
				body.addBodyElement(lookup_name).addTextNode(now);
				msg.saveChanges();
				msg.writeTo(out);
				trace("The received soap messages:",msg);
			}
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void extract_contents_and_print(SOAPMessage response) {
		// TODO Auto-generated method stub
		try {
			SOAPBody body=response.getSOAPBody();
			Name lookup_name=create_qname(response);
			Iterator it=body.getChildElements(lookup_name);
			Node next=(Node)it.next();
			String value=(next==null)?"Error":next.getValue();
			System.out.println("\n\nReturn from server:"+value);
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private void trace(String string, SOAPMessage msg) {
		// TODO Auto-generated method stub
		System.out.println("\n");
		System.out.println(string);
		try {
			msg.writeTo(System.out);
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private Name create_qname(SOAPMessage msg) {
		// TODO Auto-generated method stub
		Name name=null;
		try {
		
			SOAPEnvelope env=msg.getSOAPPart().getEnvelope();
			name=env.createName(LocalName, NamespacePrefix, Namespace);
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}
	private SOAPMessage create_soap_message() {
		// TODO Auto-generated method stub
		SOAPMessage msg=null;
		try {
			MessageFactory mf=MessageFactory.newInstance();
			msg=mf.createMessage();
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			System.err.print(e);
			e.printStackTrace();
		}
		return msg;
	}
}
