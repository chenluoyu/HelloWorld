package demo20180827;

import demo20180723.Student;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JSONArray与JSONObject
 */
public class SpringPropertyAccessFactoryDemo {

    public static void main(String[] args) {
        Student s = new Student("1",1);
        Student s1 = new Student("2",2);
        List<Student> sL = new ArrayList<>();
        sL.add(s);
        sL.add(s1);
        Map<String,Object> map = new HashMap<>();
        map.put("sList",sL);
        map.put("a","a");

        JSONArray jsonArray = JSONArray.fromObject(map);
        System.out.println(jsonArray.toString() + "---" + jsonArray.size());
        // jsonArray.element()功能：添加元素；我靠
        System.out.println(jsonArray.element("sList").toString() + "---" + jsonArray.size());
        JSONObject jsonObject = JSONObject.fromObject(map);
        System.out.println(jsonObject.toString() + "---" + jsonObject.size());
        List<Student> jsonList = JSONArray.toList(JSONArray.fromObject(jsonObject.get("sList")), new Student(), new JsonConfig());
        System.out.println(jsonList.toString());

        // 前台传递json格式数据，使用map接收，结果类似这种
        Map<String,Object> jsonMap = new HashMap<>();
        jsonMap.put("sList","[{age:1,name:1},{age:2,name:2}]");
        jsonMap.put("count","2");
        List<Student> jsonListMap = JSONArray.toList(JSONArray.fromObject(jsonMap.get("sList")), new Student(), new JsonConfig());
        System.out.println(jsonListMap.toString());

        // 直接强转不行：因为获取到的value是个String字符串
//        JSONObject sList = jsonArray.toJSONObject(jsonArray.element("sList"));
//        List<Student> ss = (List<Student>) sList.get("sList");
//        System.out.println(ss.size());

    }
}
