package org.zerock.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude= {"val3"})
public class SampleVO {
	
	private String val1;
	private String val2;
	private String val3;
	
}
