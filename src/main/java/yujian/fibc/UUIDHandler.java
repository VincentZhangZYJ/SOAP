package yujian.fibc;

import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class UUIDHandler {
	private static final String LoggerName="ClientSideLogger";
	private Logger logger;
	private final boolean log_p=true;
	public UUIDHandler(){
		logger=Logger.getLogger(LoggerName);
	}
	public boolean handleMessage(SOAPMessageContext ctx){
		if(log_p) logger.info("handleMessage");
		
		Boolean request_p=(Boolean)ctx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(request_p){
			UUID uuid=UUID.randomUUID();
			SOAPMessage msg=ctx.getMessage();
			SOAPEnvelope env=msg.getSOAPPart().getEnvelope();
			SOAPHeader hdr=env.getHeader();
			if(hdr==null) hdr=env.addHeader();
			QName qname=new QName("http://yujian.fibc","uuid");
			
		}
		return true;
	}
}
