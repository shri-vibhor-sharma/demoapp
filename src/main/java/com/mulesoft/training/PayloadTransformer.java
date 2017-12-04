package com.mulesoft.training;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class PayloadTransformer extends AbstractTransformer{

	@Override
	protected Object doTransform(Object src, String enc) throws TransformerException {
		String name = src.toString();
		return "Hello from Java"+name;
	}

}
