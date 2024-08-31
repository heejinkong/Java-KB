<%@ page import="org.json.simple.JSONObject" %>
<%@ page import="org.json.simple.JSONArray" %><%
    //hashmap(key:value)
    JSONObject json = new JSONObject();
    json.put("today", "rain");
    json.put("temp", "20");
    json.put("hu", "90");
    json.put("location", "seoul");

    JSONObject json2 = new JSONObject();
    json2.put("today", "sun");
    json2.put("temp", "15");
    json2.put("hu", "70");
    json2.put("location", "busan");

//arraylist(element)
    JSONArray array = new JSONArray();
    array.add(json);
    array.add(json2);
%>
<%= array.toJSONString() %>
