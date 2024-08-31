<%@ page import="org.json.simple.JSONObject" %>
<%@ page import="org.json.simple.JSONArray" %><%
    //hashmap(key:value)
    JSONObject json = new JSONObject();
    json.put("name", "kim");
    json.put("age", 20);
    json.put("pic", "kim.png");

    JSONObject json2 = new JSONObject();
    json2.put("name", "park");
    json2.put("age", 30);
    json2.put("pic", "park.png");

    JSONObject json3 = new JSONObject();
    json3.put("name", "song");
    json3.put("age", 40);
    json3.put("pic", "song.png");

//arraylist(element)
    JSONArray array = new JSONArray();
    array.add(json);
    array.add(json2);
    array.add(json3);
%>
<%= array.toJSONString() %>
