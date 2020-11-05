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
	public static Set<List<Station>> lineSet = new HashSet<List<Station>>();//所有线集合
	public static int totalStaion = 0;//总的站点数量
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
		//1号线
		line1Str = "苹果园 古城 八角游乐园 八宝山 玉泉路 五棵松 万寿路 公主坟 军事博物馆 木樨路 南礼士路 复兴门 西单 天安门西 天安门东 王府井 东单 建国门 永安里 国贸 大望路 四惠 四惠东";
		String[] line1Arr = line1Str.split(" ");
		for(String s : line1Arr){
			line1.add(new Station(s));
		}
		for(int i =0;i<line1.size();i++){
			if(i<line1.size()-1){
				line1.get(i).next = line1.get(i+1);
				line1.get(i+1).prev = line1.get(i);
			}
		}//1号线
		
		
		line2Str = "西直门 积水潭 鼓楼大街 安定门 雍和宫 东直门 东四十条 朝阳门 建国门 北京站 崇文门 前门 和平门 宣武门 长椿街 复兴门 阜成门 车公庄 西直门";
		String[] line2Arr = line2Str.split(" ");
		for(String s : line2Arr){
			line2.add(new Station(s));
		}
		for(int i =0;i<line2.size();i++){
			if(i<line2.size()-1){
				line2.get(i).next = line2.get(i+1);
				line2.get(i+1).prev = line2.get(i);
			}
		}//2号线
		
		line4Str = "大兴线 安河桥北 北宫门 西苑 圆明园 北京大学东门 中关村 海淀黄庄 人民大学 魏公村 国家图书馆 动物园 西直门 新街口 平安里 西四 灵境胡同 西单 宣武门 菜市口 陶然亭 北京南站 马家堡 角门西 公益西桥 新宫 西红门 高米店北 高米店南 枣园 清源路 黄村西大街 黄村火车站 义和庄 生物医药基地 天宫院";
		String[] line4Arr = line4Str.split(" ");
		for(String s : line4Arr){
			line4.add(new Station(s));
		}
		for(int i =0;i<line4.size();i++){
			if(i<line4.size()-1){
				line4.get(i).next = line4.get(i+1);
				line4.get(i+1).prev = line4.get(i);
			}
		}//4号线
		
		line5Str = "天通苑北 天通苑 天通苑南 立水桥 立水桥南 北苑路北 大屯东路 惠新四街北口 惠新四街南口 和平西桥 和平里北街 雍和宫 北新桥 张自忠路 东四	灯市口 东单 崇文门 磁器口 天坛东门 蒲黄榆 刘家窑 宋家庄";
		String[] line5Arr = line5Str.split(" ");
		for(String s : line5Arr){
			line5.add(new Station(s));
		}
		for(int i =0;i<line5.size();i++){
			if(i<line5.size()-1){
				line5.get(i).next = line5.get(i+1);
				line5.get(i+1).prev = line5.get(i);
			}
		}//5号线
		
		line6Str = "海淀五路居 慈寿寺 花园桥 白石桥南 车公庄西 车公庄 平安里 北海北 南锣鼓巷 东四 朝阳门 东大桥 呼家楼 金台路 十里堡 青年路 褡裢坡 黄渠 常营 草房 物资学院路 通州北关 北运河西 郝家府 东夏园 潞城";
		String[] line6Arr = line6Str.split(" ");
		for(String s : line4Arr){
			line6.add(new Station(s));
		}
		for(int i =0;i<line6.size();i++){
			if(i<line6.size()-1){
				line6.get(i).next = line6.get(i+1);
				line6.get(i+1).prev = line6.get(i);
			}
		}//6号线
		
		line7Str = "北京西站 湾子 达官营 广安门内 菜市口 虎坊桥 珠市口 桥湾 磁器口 广渠门内 广渠门外 九龙山 大郊亭 百子湾 化工 南楼梓庄 欢乐谷景区 双合 焦化厂";
		String[] line7Arr = line7Str.split(" ");
		for(String s : line7Arr){
			line7.add(new Station(s));
		}
		for(int i =0;i<line7.size();i++){
			if(i<line7.size()-1){
				line7.get(i).next = line7.get(i+1);
				line7.get(i+1).prev = line7.get(i);
			}
		}//7号线
		
		
		line8Str = "朱辛庄 育知路 平西府 回龙观东大街 霍营 育新 西小口 永泰庄 林萃桥 森林公园南门 奥林匹克公园 奥林中心 北土城 安华桥 安德里北街 鼓楼大街 什刹海 南锣鼓巷 中国美术馆";
		String[] line8Arr = line8Str.split(" ");
		for(String s : line8Arr){
			line8.add(new Station(s));
		}
		for(int i =0;i<line8.size();i++){
			if(i<line8.size()-1){
				line8.get(i).next = line8.get(i+1);
				line8.get(i+1).prev = line8.get(i);
			}
		}//8号线
		
		line8SStr = "珠市口 天桥 永定门外 木樨园 海户屯 大红门南 和义 东高地 火箭万源 五福堂 德茂 瀛海";
		String[] line8SArr = line8SStr.split(" ");
		for(String s : line8SArr){
			line8S.add(new Station(s));
		}
		for(int i =0;i<line8S.size();i++){
			if(i<line8S.size()-1){
				line8S.get(i).next = line8S.get(i+1);
				line8S.get(i+1).prev = line8S.get(i);
			}
		}//8S号线
		
		
		line9Str = "郭公庄 丰台科技园 科怡路 丰台南路 丰台东大街 七里庄 六里桥 六里桥东 北京西站 军事博物馆 白堆子 白石桥南 国家图书馆";
		String[] line9Arr = line9Str.split(" ");
		for(String s : line9Arr){
			line9.add(new Station(s));
		}
		for(int i =0;i<line9.size();i++){
			if(i<line9.size()-1){
				line9.get(i).next = line9.get(i+1);
				line9.get(i+1).prev = line9.get(i);
			}
		}//9号线
		
		
		line10Str = "巴沟 苏州街 海淀黄庄 知春里 知春路 西土城 牡丹园 健德门 北土城 安贞门 惠新西街南口 芍药居 太阳宫 三元桥 亮马桥 农业展览馆 团结湖 呼家楼 金台夕照 国贸 双井 劲松 潘家园 十里河 分钟寺 成寿寺 宋家庄 石榴庄 大红门 角门东 角门西 草桥 纪家庙 首经贸 丰台站 泥洼 西局 六里桥 莲花桥 公主坟 西钓鱼台 慈寿寺 车道沟 长春桥 火器营 巴沟";
		String[] line10Arr = line10Str.split(" ");
		for(String s : line10Arr){
			line10.add(new Station(s));
		}
		for(int i =0;i<line10.size();i++){
			if(i<line10.size()-1){
				line10.get(i).next = line10.get(i+1);
				line10.get(i+1).prev = line10.get(i);
			}
		}//10号线
		
		line13Str = "西直门 大钟寺 知春路 五道口 上地 西二旗 龙泽 回龙观 霍营 立水桥 北苑 望京西 芍药居 光熙门 柳芳 东直门";
		String[] line13Arr = line13Str.split(" ");
		for(String s : line13Arr){
			line13.add(new Station(s));
		}
		for(int i =0;i<line13.size();i++){
			if(i<line13.size()-1){
				line13.get(i).next = line13.get(i+1);
				line13.get(i+1).prev = line13.get(i);
			}
		}//13号线
		
		line14WStr = "西局 七里庄 大井 郭庄子 大瓦窑 园博园 张郭庄";
		String[] line14WArr = line14WStr.split(" ");
		for(String s : line14WArr){
			line14W.add(new Station(s));
		}
		for(int i =0;i<line14W.size();i++){
			if(i<line14W.size()-1){
				line14W.get(i).next = line14W.get(i+1);
				line14W.get(i+1).prev = line14W.get(i);
			}
		}//14W号线
		
		
		line14EStr = "善各庄 来广营 东湖渠 望京 阜通 望京南 将台 东风北桥 枣营 朝阳公园 金台路 大望路 九龙山 平乐园 北工大西门 十里河 方庄 蒲黄榆 景泰 永定门外 北京南站";
		String[] line14EArr = line14EStr.split(" ");
		for(String s : line14EArr){
			line14E.add(new Station(s));
		}
		for(int i =0;i<line14E.size();i++){
			if(i<line14E.size()-1){
				line14E.get(i).next = line14E.get(i+1);
				line14E.get(i+1).prev = line14E.get(i);
			}
		}//14E号线
		
		line15Str = "俸伯 顺义 石门 南法信 后沙峪 花梨坎 国展 孙河 马泉营 崔各庄 望京东 望京 望京西 关庄 大屯路东 安立路 奥林匹克公园 北沙滩 六道口 清华东路西口";
		String[] line15Arr = line15Str.split(" ");
		for(String s : line15Arr){
			line15.add(new Station(s));
		}
		for(int i =0;i<line15.size();i++){
			if(i<line15.size()-1){
				line15.get(i).next = line15.get(i+1);
				line15.get(i+1).prev = line15.get(i);
			}
		}//15号线
		
		line16Str = "北安河 温阳路 稻香湖路 屯佃 永丰 永丰南 西北旺 马连洼 农大南路 西苑";
		String[] line16Arr = line16Str.split(" ");
		for(String s : line16Arr){
			line16.add(new Station(s));
		}
		for(int i =0;i<line16.size();i++){
			if(i<line16.size()-1){
				line16.get(i).next = line16.get(i+1);
				line16.get(i+1).prev = line16.get(i);
			}
		}//16号线
		
		lineBatongStr = "四惠 四惠东 高碑店 传媒大学 双桥 管庄 八里桥 通州北苑 果园 九棵树 梨园 临河里 土桥";
		String[] lineBatongArr = lineBatongStr.split(" ");
		for(String s : lineBatongArr){
			lineBatong.add(new Station(s));
		}
		for(int i =0;i<lineBatong.size();i++){
			if(i<lineBatong.size()-1){
				lineBatong.get(i).next = lineBatong.get(i+1);
				lineBatong.get(i+1).prev = lineBatong.get(i);
			}
		}//Batong线
		
		lineChangpingStr = "昌平西山口 十三陵景区 昌平 昌平东关 北邵洼 南邵 沙河高教园 沙河 巩华城 朱辛庄 生命科学园 西二旗";
		String[] lineChangpingArr = lineChangpingStr.split(" ");
		for(String s : lineChangpingArr){
			lineChangping.add(new Station(s));
		}
		for(int i =0;i<lineChangping.size();i++){
			if(i<lineChangping.size()-1){
				lineChangping.get(i).next = lineChangping.get(i+1);
				lineChangping.get(i+1).prev = lineChangping.get(i);
			}
		}//Changping线
		
		lineFangshanStr = "阎村东 苏庄 良乡南关 良乡大学城西 良乡大学城 良乡大学城北 广阳城 篱笆房 长阳 稻田 大葆台 郭公庄";
		String[] lineFangshanArr = lineFangshanStr.split(" ");
		for(String s : lineFangshanArr){
			lineFangshan.add(new Station(s));
		}
		for(int i =0;i<lineFangshan.size();i++){
			if(i<lineFangshan.size()-1){
				lineFangshan.get(i).next = lineFangshan.get(i+1);
				lineFangshan.get(i+1).prev = lineFangshan.get(i);
			}
		}//Fangshan线
		
		lineShouduStr = "T3航站楼 T2航站楼 三元桥 东直门 ";
		String[] lineShouduArr = lineShouduStr.split(" ");
		for(String s : lineShouduArr){
			lineShoudu.add(new Station(s));
		}
		for(int i =0;i<lineShoudu.size();i++){
			if(i<lineShoudu.size()-1){
				lineShoudu.get(i).next = lineShoudu.get(i+1);
				lineShoudu.get(i+1).prev = lineShoudu.get(i);
			}
		}//Shoudu线
		
		lineXijiaoStr = "巴沟 颐和园西门 茶棚 万安 植物园 香山 ";
		String[] lineXijiaoArr = lineXijiaoStr.split(" ");
		for(String s : lineXijiaoArr){
			lineXijiao.add(new Station(s));
		}
		for(int i =0;i<lineXijiao.size();i++){
			if(i<lineXijiao.size()-1){
				lineXijiao.get(i).next = lineXijiao.get(i+1);
				lineXijiao.get(i+1).prev = lineXijiao.get(i);
			}
		}//Xijiao线
		
		lineYanfangStr = "阎村东 紫草坞 阎村 星城 大石河东 马各庄 饶乐府 房山城关 燕山 ";
		String[] lineYanfangArr = lineYanfangStr.split(" ");
		for(String s : lineYanfangArr){
			lineYanfang.add(new Station(s));
		}
		for(int i =0;i<lineYanfang.size();i++){
			if(i<lineYanfang.size()-1){
				lineYanfang.get(i).next = lineYanfang.get(i+1);
				lineYanfang.get(i+1).prev = lineYanfang.get(i);
			}
		}//Yanfang线
		
		lineYizhuangStr = "宋家庄 肖村 小红门 旧宫 亦庄桥 亦庄文化园 万源街 荣京东街 荣昌东街 同济南路 经海路 次渠南 次渠 亦庄火车站";
		String[] lineYizhuangArr = lineYizhuangStr.split(" ");
		for(String s : lineYizhuangArr){
			lineYizhuang.add(new Station(s));
		}
		for(int i =0;i<lineYizhuang.size();i++){
			if(i<lineYizhuang.size()-1){
				lineYizhuang.get(i).next = lineYizhuang.get(i+1);
				lineYizhuang.get(i+1).prev = lineYizhuang.get(i);
			}
		}//Yizhuang线
		
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
