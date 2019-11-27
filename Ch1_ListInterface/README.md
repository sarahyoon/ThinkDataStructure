### Interface-based programming Style Example
> #### Use List interface instead of specifying LinkedList or ArrayList

* ListClientExample Class
  - Encapsulates a List(contains a List as an instace variable)
  - Returns internal List object by getList method
  
* ListCleintExampleTest Class
  - Junit test for ListClientExample
  - Creates a ListClientExample, invokes getList, and then checks if the result is an ArrayList

