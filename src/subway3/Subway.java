package subway3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner; 

public class Subway {
	
	private static Scanner input;
	private List<Station> outList = new ArrayList<Station>();
	public void calculate(Station s1,Station s2){
		if(outList.size() == DataBuilder.totalStaion){
//			System.out.println("共经过"+(s1.getAllPassedStations(s2).size()-1)+"站");
			int m=s1.getAllPassedStations(s2).size()-1;
			if(m!=0) {
				System.out.println("共经过"+(s1.getAllPassedStations(s2).size()-1)+"站");
			for(Station station : s1.getAllPassedStations(s2)){
				System.out.print(station.getName()+"》");
			}
			}
			if(m==0)
			{
				System.out.print("输入站点不正确");
			}
			return;
		}
		if(!outList.contains(s1)){
			outList.add(s1);
		}

		if(s1.getOrderSetMap().isEmpty()){
			List<Station> Linkedstations = getAllLinkedStations(s1);
			for(Station s : Linkedstations){
				s1.getAllPassedStations(s).add(s);
			}
		}
		Station xz = getShortestPath(s1);
	
		
		
		
	
		
		
		for(Station xh : getAllLinkedStations(xz)){
			if(outList.contains(xh)){
				continue;
			}
			int shortestPath = (s1.getAllPassedStations(xz).size()-1) + 1;
			if(s1.getAllPassedStations(xh).contains(xh)){

				if((s1.getAllPassedStations(xh).size()-1) > shortestPath){
		
					s1.getAllPassedStations(xh).clear();
					s1.getAllPassedStations(xh).addAll(s1.getAllPassedStations(xz));
					s1.getAllPassedStations(xh).add(xh);
				}
			} else {
		
				s1.getAllPassedStations(xh).addAll(s1.getAllPassedStations(xz));
				s1.getAllPassedStations(xh).add(xh);
			}
		}
		outList.add(xz);
		calculate(s1,s2);
	}
	

	private Station getShortestPath(Station station){
		int minPatn = Integer.MAX_VALUE;
		Station rets = null;
		for(Station s :station.getOrderSetMap().keySet()){
			if(outList.contains(s)){
				continue;
			}
			LinkedHashSet<Station> set  = station.getAllPassedStations(s);
			if(set.size() < minPatn){
				minPatn = set.size();
				rets = s;
			}
		}
		return rets;
	}
	

	private List<Station> getAllLinkedStations(Station station){
		List<Station> linkedStaions = new ArrayList<Station>();
		for(List<Station> line : DataBuilder.lineSet){
			if(line.contains(station)){
				Station s = line.get(line.indexOf(station));
				if(s.prev != null){
					linkedStaions.add(s.prev);
				}
				if(s.next != null){
					linkedStaions.add(s.next);
				}
			}
		}
		return linkedStaions;
	}
 

	public static void main(String[] args) {
		 
		System.out.println("执行两站之间最短路线功能输入:1");
		System.out.println("执行查询地铁线路功能输入:2");
		Scanner input=new Scanner(System.in);
		System.out.print("请输入功能:");
		String start=input.next();
		
		if(start.equals("1")) {
			
		Subway sw = new Subway();
		System.out.print("请输入起始站:");
		String begin_station_name=input.next();
		System.out.print("请输入终点站：");
        String end_station_name=input.next();
		
		sw.calculate(new Station(begin_station_name), new Station(end_station_name));
		}
		if(start.equals("2")) {
			System.out.print("请输入所要查询的线路:");
			String a=input.next();
			if(a.contentEquals("1号线")) 
				System.out.println(DataBuilder.line1Str);
			if(a.contentEquals("2号线")) 
				System.out.println(DataBuilder.line2Str);
			if(a.contentEquals("4号线")) 
				System.out.println(DataBuilder.line4Str);
			if(a.contentEquals("5号线")) 
				System.out.println(DataBuilder.line5Str);
			if(a.contentEquals("6号线")) 
				System.out.println(DataBuilder.line6Str);
			if(a.contentEquals("7号线")) 
				System.out.println(DataBuilder.line7Str);
			if(a.contentEquals("8号线")) 
				System.out.println(DataBuilder.line8Str);
			if(a.contentEquals("8号线南段")) 
				System.out.println(DataBuilder.line8SStr);
			if(a.contentEquals("9号线")) 
				System.out.println(DataBuilder.line9Str);
			if(a.contentEquals("10号线")) 
				System.out.println(DataBuilder.line10Str);
			if(a.contentEquals("13号线")) 
				System.out.println(DataBuilder.line13Str);
			if(a.contentEquals("14号线西段")) 
				System.out.println(DataBuilder.line14WStr);
			if(a.contentEquals("14号线东段")) 
				System.out.println(DataBuilder.line14EStr);
			if(a.contentEquals("15号线")) 
				System.out.println(DataBuilder.line15Str);
			if(a.contentEquals("16号线")) 
				System.out.println(DataBuilder.line16Str);
			if(a.contentEquals("八通线")) 
				System.out.println(DataBuilder.lineBatongStr);
			if(a.contentEquals("昌平线")) 
				System.out.println(DataBuilder.lineChangpingStr);
			if(a.contentEquals("房山线")) 
				System.out.println(DataBuilder.lineFangshanStr);
			if(a.contentEquals("首都机场线")) 
				System.out.println(DataBuilder.lineShouduStr);
			if(a.contentEquals("西郊线")) 
				System.out.println(DataBuilder.lineXijiaoStr);
			if(a.contentEquals("燕房线")) 
				System.out.println(DataBuilder.lineYanfangStr);
			if(a.contentEquals("亦庄线")) 
				System.out.println(DataBuilder.lineYizhuangStr);
			else {
				System.out.println("请输入正确线路");
			}
			
		}
		
		
	}
}
