Unofficial WunderList API Client written in Java
================================================

This is an official API Client for Wunderlist. The Wunderlist API is not yet open to public but it still can be accessed if we know the endpoints and the parameters.


Building
--------

The project can be opened in Eclipse. Alternatively, it can be built through gradle

::

D:\Users\madhur\workspace\location\Wunderjava>gradle mainjar
:mainjar UP-TO-DATE

BUILD SUCCESSFUL

Total time: 3.945 secs
D:\Users\madhur\workspace\location\Wunderjava>cd build

D:\Users\madhur\workspace\location\Wunderjava\build>cd libs

D:\Users\madhur\workspace\location\Wunderjava\build\libs>java -jar Wunderjava.jar

Examples
--------

Invoking the API is simple. There is a helper class `WunderList` which is basically a singleton and you have get its instance by providing the wunderlist `username` and `password`. Once we have
the instance we can invoke the corresponding helper methods such as `GetLists` and `GetTasks`. 

::

wunderList=WunderList.getInstance(username, password);

List<WList> wlists=wunderList.GetLists();

List<WTask> wTasks=wunderList.GetTasks();


Contributing
------------

I will be glad to accept pull requests to make this API client as complete as possible. Since this is still a very partial implementation, I look forward to the contributions from people who want to build something awesome using Wunderlist API.

