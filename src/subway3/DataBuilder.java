package subway3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import subway3.Station;

public class DataBuilder {
	public static List<Station> line1 = new ArrayList<Station>();
	public static List<Station> line2 = new ArrayList<Station>();
	public static List<Station> line4 = new ArrayList<Station>();
	public static List<Station> line5 = new ArrayList<Station>();
	public static List<Station> line6 = new ArrayList<Station>();
	public static List<Station> line7 = new ArrayList<Station>();
	public static List<Station> line8 = new ArrayList<Station>();
	public static List<Station> line8S = new ArrayList<Station>();
	public static List<Station> line9= new ArrayList<Station>();
	public static List<Station> line10 = new ArrayList<Station>();
	public static List<Station> line13 = new ArrayList<Station>();
	public static List<Station> line14W= new ArrayList<Station>();
	public static List<Station> line14E = new ArrayList<Station>();
	public static List<Station> line15= new ArrayList<Station>();
	public static List<Station> line16= new ArrayList<Station>();
	public static List<Station> lineBatong= new ArrayList<Station>();
	public static List<Station> lineChangping= new ArrayList<Station>();
	public static List<Station> lineFangshan= new ArrayList<Station>();
	public static List<Station> lineShoudu= new ArrayList<Station>();
	public static List<Station> lineXijiao= new ArrayList<Station>();
	public static List<Station> lineYanfang= new ArrayList<Station>();
	public static List<Station> lineYizhuang= new ArrayList<Station>();
	public static Set<List<Station>> lineSet = new HashSet<List<Station>>();//�����߼���
	public static int totalStaion = 0;//�ܵ�վ������
	public static String line1Str;
	public static String line2Str;
	public static String line4Str;
	public static String line5Str;
	public static String line6Str;
	public static String line7Str;
	public static String line8Str;
	public static String line8SStr;
	public static String line9Str;
	public static String line10Str;
	public static String line13Str;
	public static String line14WStr;
	public static String line14EStr;
	public static String line15Str;
	public static String line16Str;
	public static String lineBatongStr;
	public static String lineChangpingStr;
	public static String lineFangshanStr;
	public static String lineShouduStr;
	public static String lineXijiaoStr;
	public static String lineYanfangStr;
	public static String lineYizhuangStr;
	
	static {		
		//1����
		line1Str = "ƻ��԰ �ų� �˽�����԰ �˱�ɽ ��Ȫ· ����� ����· ������ ���²���� ľ��· ����ʿ· ������ ���� �찲���� �찲�Ŷ� ������ ���� ������ ������ ��ó ����· �Ļ� �Ļݶ�";
		String[] line1Arr = line1Str.split(" ");
		for(String s : line1Arr){
			line1.add(new Station(s));
		}
		for(int i =0;i<line1.size();i++){
			if(i<line1.size()-1){
				line1.get(i).next = line1.get(i+1);
				line1.get(i+1).prev = line1.get(i);
			}
		}//1����
		
		
		line2Str = "��ֱ�� ��ˮ̶ ��¥��� ������ Ӻ�͹� ��ֱ�� ����ʮ�� ������ ������ ����վ ������ ǰ�� ��ƽ�� ������ ������ ������ ������ ����ׯ ��ֱ��";
		String[] line2Arr = line2Str.split(" ");
		for(String s : line2Arr){
			line2.add(new Station(s));
		}
		for(int i =0;i<line2.size();i++){
			if(i<line2.size()-1){
				line2.get(i).next = line2.get(i+1);
				line2.get(i+1).prev = line2.get(i);
			}
		}//2����
		
		line4Str = "������ �����ű� ������ ��Է Բ��԰ ������ѧ���� �йش� �����ׯ �����ѧ κ���� ����ͼ��� ����԰ ��ֱ�� �½ֿ� ƽ���� ���� �龳��ͬ ���� ������ ���п� ��Ȼͤ ������վ ��ұ� ������ �������� �¹� ������ ���׵걱 ���׵��� ��԰ ��Դ· �ƴ������ �ƴ��վ ���ׯ ����ҽҩ���� �칬Ժ";
		String[] line4Arr = line4Str.split(" ");
		for(String s : line4Arr){
			line4.add(new Station(s));
		}
		for(int i =0;i<line4.size();i++){
			if(i<line4.size()-1){
				line4.get(i).next = line4.get(i+1);
				line4.get(i+1).prev = line4.get(i);
			}
		}//4����
		
		line5Str = "��ͨԷ�� ��ͨԷ ��ͨԷ�� ��ˮ�� ��ˮ���� ��Է·�� ���Ͷ�· �����Ľֱ��� �����Ľ��Ͽ� ��ƽ���� ��ƽ�ﱱ�� Ӻ�͹� ������ ������· ����	���п� ���� ������ ������ ��̳���� �ѻ��� ����Ҥ �μ�ׯ";
		String[] line5Arr = line5Str.split(" ");
		for(String s : line5Arr){
			line5.add(new Station(s));
		}
		for(int i =0;i<line5.size();i++){
			if(i<line5.size()-1){
				line5.get(i).next = line5.get(i+1);
				line5.get(i+1).prev = line5.get(i);
			}
		}//5����
		
		line6Str = "������·�� ������ ��԰�� ��ʯ���� ����ׯ�� ����ׯ ƽ���� ������ ������� ���� ������ ������ ����¥ ��̨· ʮ�ﱤ ����· ������ ���� ��Ӫ �ݷ� ����ѧԺ· ͨ�ݱ��� ���˺��� �¼Ҹ� ����԰ º��";
		String[] line6Arr = line6Str.split(" ");
		for(String s : line4Arr){
			line6.add(new Station(s));
		}
		for(int i =0;i<line6.size();i++){
			if(i<line6.size()-1){
				line6.get(i).next = line6.get(i+1);
				line6.get(i+1).prev = line6.get(i);
			}
		}//6����
		
		line7Str = "������վ ���� ���Ӫ �㰲���� ���п� ������ ���п� ���� ������ �������� �������� ����ɽ ��ͤ ������ ���� ��¥��ׯ ���ֹȾ��� ˫�� ������";
		String[] line7Arr = line7Str.split(" ");
		for(String s : line7Arr){
			line7.add(new Station(s));
		}
		for(int i =0;i<line7.size();i++){
			if(i<line7.size()-1){
				line7.get(i).next = line7.get(i+1);
				line7.get(i+1).prev = line7.get(i);
			}
		}//7����
		
		
		line8Str = "����ׯ ��֪· ƽ���� �����۶���� ��Ӫ ���� ��С�� ��̩ׯ ������ ɭ�ֹ�԰���� ����ƥ�˹�԰ �������� ������ ������ �����ﱱ�� ��¥��� ʲɲ�� ������� �й�������";
		String[] line8Arr = line8Str.split(" ");
		for(String s : line8Arr){
			line8.add(new Station(s));
		}
		for(int i =0;i<line8.size();i++){
			if(i<line8.size()-1){
				line8.get(i).next = line8.get(i+1);
				line8.get(i+1).prev = line8.get(i);
			}
		}//8����
		
		line8SStr = "���п� ���� �������� ľ��԰ ������ ������� ���� ���ߵ� �����Դ �帣�� ��ï 孺�";
		String[] line8SArr = line8SStr.split(" ");
		for(String s : line8SArr){
			line8S.add(new Station(s));
		}
		for(int i =0;i<line8S.size();i++){
			if(i<line8S.size()-1){
				line8S.get(i).next = line8S.get(i+1);
				line8S.get(i+1).prev = line8S.get(i);
			}
		}//8S����
		
		
		line9Str = "����ׯ ��̨�Ƽ�԰ ����· ��̨��· ��̨����� ����ׯ ������ �����Ŷ� ������վ ���²���� �׶��� ��ʯ���� ����ͼ���";
		String[] line9Arr = line9Str.split(" ");
		for(String s : line9Arr){
			line9.add(new Station(s));
		}
		for(int i =0;i<line9.size();i++){
			if(i<line9.size()-1){
				line9.get(i).next = line9.get(i+1);
				line9.get(i+1).prev = line9.get(i);
			}
		}//9����
		
		
		line10Str = "�͹� ���ݽ� �����ׯ ֪���� ֪��· ������ ĵ��԰ ������ ������ ������ ���������Ͽ� ��ҩ�� ̫���� ��Ԫ�� ������ ũҵչ���� �Ž�� ����¥ ��̨Ϧ�� ��ó ˫�� ���� �˼�԰ ʮ��� ������ ������ �μ�ׯ ʯ��ׯ ����� ���Ŷ� ������ ���� �ͼ��� �׾�ó ��̨վ ���� ���� ������ ������ ������ ������̨ ������ ������ ������ ����Ӫ �͹�";
		String[] line10Arr = line10Str.split(" ");
		for(String s : line10Arr){
			line10.add(new Station(s));
		}
		for(int i =0;i<line10.size();i++){
			if(i<line10.size()-1){
				line10.get(i).next = line10.get(i+1);
				line10.get(i+1).prev = line10.get(i);
			}
		}//10����
		
		line13Str = "��ֱ�� ������ ֪��· ����� �ϵ� ������ ���� ������ ��Ӫ ��ˮ�� ��Է ������ ��ҩ�� ������ ���� ��ֱ��";
		String[] line13Arr = line13Str.split(" ");
		for(String s : line13Arr){
			line13.add(new Station(s));
		}
		for(int i =0;i<line13.size();i++){
			if(i<line13.size()-1){
				line13.get(i).next = line13.get(i+1);
				line13.get(i+1).prev = line13.get(i);
			}
		}//13����
		
		line14WStr = "���� ����ׯ �� ��ׯ�� ����Ҥ ԰��԰ �Ź�ׯ";
		String[] line14WArr = line14WStr.split(" ");
		for(String s : line14WArr){
			line14W.add(new Station(s));
		}
		for(int i =0;i<line14W.size();i++){
			if(i<line14W.size()-1){
				line14W.get(i).next = line14W.get(i+1);
				line14W.get(i+1).prev = line14W.get(i);
			}
		}//14W����
		
		
		line14EStr = "�Ƹ�ׯ ����Ӫ ������ ���� ��ͨ ������ ��̨ ���籱�� ��Ӫ ������԰ ��̨· ����· ����ɽ ƽ��԰ ���������� ʮ��� ��ׯ �ѻ��� ��̩ �������� ������վ";
		String[] line14EArr = line14EStr.split(" ");
		for(String s : line14EArr){
			line14E.add(new Station(s));
		}
		for(int i =0;i<line14E.size();i++){
			if(i<line14E.size()-1){
				line14E.get(i).next = line14E.get(i+1);
				line14E.get(i+1).prev = line14E.get(i);
			}
		}//14E����
		
		line15Str = "ٺ�� ˳�� ʯ�� �Ϸ��� ��ɳ�� ���濲 ��չ ��� ��ȪӪ �޸�ׯ ������ ���� ������ ��ׯ ����·�� ����· ����ƥ�˹�԰ ��ɳ̲ ������ �廪��·����";
		String[] line15Arr = line15Str.split(" ");
		for(String s : line15Arr){
			line15.add(new Station(s));
		}
		for(int i =0;i<line15.size();i++){
			if(i<line15.size()-1){
				line15.get(i).next = line15.get(i+1);
				line15.get(i+1).prev = line15.get(i);
			}
		}//15����
		
		line16Str = "������ ����· �����· �͵� ���� ������ ������ ������ ũ����· ��Է";
		String[] line16Arr = line16Str.split(" ");
		for(String s : line16Arr){
			line16.add(new Station(s));
		}
		for(int i =0;i<line16.size();i++){
			if(i<line16.size()-1){
				line16.get(i).next = line16.get(i+1);
				line16.get(i+1).prev = line16.get(i);
			}
		}//16����
		
		lineBatongStr = "�Ļ� �Ļݶ� �߱��� ��ý��ѧ ˫�� ��ׯ ������ ͨ�ݱ�Է ��԰ �ſ��� ��԰ �ٺ��� ����";
		String[] lineBatongArr = lineBatongStr.split(" ");
		for(String s : lineBatongArr){
			lineBatong.add(new Station(s));
		}
		for(int i =0;i<lineBatong.size();i++){
			if(i<lineBatong.size()-1){
				lineBatong.get(i).next = lineBatong.get(i+1);
				lineBatong.get(i+1).prev = lineBatong.get(i);
			}
		}//Batong��
		
		lineChangpingStr = "��ƽ��ɽ�� ʮ���꾰�� ��ƽ ��ƽ���� ������ ���� ɳ�Ӹ߽�԰ ɳ�� ������ ����ׯ ������ѧ԰ ������";
		String[] lineChangpingArr = lineChangpingStr.split(" ");
		for(String s : lineChangpingArr){
			lineChangping.add(new Station(s));
		}
		for(int i =0;i<lineChangping.size();i++){
			if(i<lineChangping.size()-1){
				lineChangping.get(i).next = lineChangping.get(i+1);
				lineChangping.get(i+1).prev = lineChangping.get(i);
			}
		}//Changping��
		
		lineFangshanStr = "�ִ嶫 ��ׯ �����Ϲ� �����ѧ���� �����ѧ�� �����ѧ�Ǳ� ������ ��ʷ� ���� ���� ����̨ ����ׯ";
		String[] lineFangshanArr = lineFangshanStr.split(" ");
		for(String s : lineFangshanArr){
			lineFangshan.add(new Station(s));
		}
		for(int i =0;i<lineFangshan.size();i++){
			if(i<lineFangshan.size()-1){
				lineFangshan.get(i).next = lineFangshan.get(i+1);
				lineFangshan.get(i+1).prev = lineFangshan.get(i);
			}
		}//Fangshan��
		
		lineShouduStr = "T3��վ¥ T2��վ¥ ��Ԫ�� ��ֱ�� ";
		String[] lineShouduArr = lineShouduStr.split(" ");
		for(String s : lineShouduArr){
			lineShoudu.add(new Station(s));
		}
		for(int i =0;i<lineShoudu.size();i++){
			if(i<lineShoudu.size()-1){
				lineShoudu.get(i).next = lineShoudu.get(i+1);
				lineShoudu.get(i+1).prev = lineShoudu.get(i);
			}
		}//Shoudu��
		
		lineXijiaoStr = "�͹� �ú�԰���� ���� �� ֲ��԰ ��ɽ ";
		String[] lineXijiaoArr = lineXijiaoStr.split(" ");
		for(String s : lineXijiaoArr){
			lineXijiao.add(new Station(s));
		}
		for(int i =0;i<lineXijiao.size();i++){
			if(i<lineXijiao.size()-1){
				lineXijiao.get(i).next = lineXijiao.get(i+1);
				lineXijiao.get(i+1).prev = lineXijiao.get(i);
			}
		}//Xijiao��
		
		lineYanfangStr = "�ִ嶫 �ϲ��� �ִ� �ǳ� ��ʯ�Ӷ� ���ׯ ���ָ� ��ɽ�ǹ� ��ɽ ";
		String[] lineYanfangArr = lineYanfangStr.split(" ");
		for(String s : lineYanfangArr){
			lineYanfang.add(new Station(s));
		}
		for(int i =0;i<lineYanfang.size();i++){
			if(i<lineYanfang.size()-1){
				lineYanfang.get(i).next = lineYanfang.get(i+1);
				lineYanfang.get(i+1).prev = lineYanfang.get(i);
			}
		}//Yanfang��
		
		lineYizhuangStr = "�μ�ׯ Ф�� С���� �ɹ� ��ׯ�� ��ׯ�Ļ�԰ ��Դ�� �پ����� �ٲ����� ͬ����· ����· ������ ���� ��ׯ��վ";
		String[] lineYizhuangArr = lineYizhuangStr.split(" ");
		for(String s : lineYizhuangArr){
			lineYizhuang.add(new Station(s));
		}
		for(int i =0;i<lineYizhuang.size();i++){
			if(i<lineYizhuang.size()-1){
				lineYizhuang.get(i).next = lineYizhuang.get(i+1);
				lineYizhuang.get(i+1).prev = lineYizhuang.get(i);
			}
		}//Yizhuang��
		
		lineSet.add(line1);
		lineSet.add(line2);
		lineSet.add(line4);
		lineSet.add(line5);
		lineSet.add(line6);
		lineSet.add(line7);
		lineSet.add(line8);
		lineSet.add(line8S);
		lineSet.add(line9);
		lineSet.add(line10);
		lineSet.add(line13);
		lineSet.add(line14W);
		lineSet.add(line14E);
		lineSet.add(line15);
		lineSet.add(line16);
		lineSet.add(lineBatong);
		lineSet.add(lineChangping);
		lineSet.add(lineFangshan);
		lineSet.add(lineShoudu);
		lineSet.add(lineXijiao);
		lineSet.add(lineYanfang);
		lineSet.add(lineYizhuang);
		totalStaion  = line1.size() + line2.size() + line4.size() + line5.size() + line6.size() + line7.size() + line8.size() + line8S.size() + line9.size() + line10.size() + line13.size() + line14W.size() 
		+ line14E.size() + line15.size() + line16.size() + lineBatong.size() + lineChangping.size() + lineFangshan.size() + lineShoudu.size() + lineXijiao.size() + lineYanfang.size() + lineYizhuang.size();
		
}
}
