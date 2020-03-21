package com.jui.com.jui.rough;

import com.jui.utilities.MonitoringMail;
import com.jui.utilities.TestConfig;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestHostAdd {

	public static void main(String[] args) throws UnknownHostException, AddressException, MessagingException {

		MonitoringMail mail = new MonitoringMail();
		String messageBody = "http://" + InetAddress.getLocalHost().getHostAddress()
				+ ":8080/job/DataDrivenLiveProject/Extent_Reports/";
		System.out.println(messageBody);
		
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);

	}

}
