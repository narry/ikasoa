package com.ikamobile.ikasoa.rpc.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ikamobile.ikasoa.rpc.utils.StreamUtil;

public class ExampleServiceImpl implements ExampleService {

	@Override
	public ExampleVO findVO(int id) {
		ExampleVO evo = new ExampleVO();
		evo.setId(id);
		evo.setString("苏磊");
		return evo;
	}

	@Override
	public List<ExampleVO> getVOList() {
		List<ExampleVO> evoList = new ArrayList<ExampleVO>();
		ExampleVO evo = new ExampleVO();
		evo.setId(1);
		evo.setString("苏磊");
		evoList.add(evo);
		ExampleVO evo2 = new ExampleVO();
		evo2.setId(2);
		evo2.setString("苏磊苏磊");
		ExampleVO evo3 = new ExampleVO();
		evo3.setId(2322);
		evo3.setString("苏磊苏磊苏磊");
		evo2.setEvo(evo3);
		evoList.add(evo2);
		evoList.add(evo3);
		return evoList;
	}

	@Override
	public Boolean getBoolean() {
		return true;
	}

	@Override
	public boolean getBoolean2() {
		return false;
	}

	@Override
	public double getDouble(long l) {
		return -213.56564 + l;
	}

	@Override
	public Date getDate(int id, Date date) {
		return date;
	}

	@Override
	public String[] testByStrings(String... strings) {
		return strings;
	}

	@Override
	public int testByInts(Integer[] ints) {
		return ints.length;
	}

	@Override
	public Map<String, ExampleVO> getMap(int id, Map<String, ExampleVO> map) {
		return map;
	}

	@Override
	public byte[] getBytes(byte[] bytes) {
		return bytes;
	}

	@Override
	public int getInt() throws IkasoaTestException, Exception {
		throw new IkasoaTestException("明天不上班.");
	}

	@Override
	public byte[] down() throws FileNotFoundException {
		return StreamUtil.inputStreamToBytes(
				new FileInputStream(new File("C:/Documents and Settings/larry/My Documents/My Pictures/fx.jpg")));
	}

	@Override
	public ExampleSuperVO getExampleSuperVO(ExampleSuperVO esvo) {
		System.out.println(esvo instanceof ExampleVO);
		ExampleVO evo = (ExampleVO) esvo;
		System.out.println(evo.getId());
		return esvo;
	}

}
