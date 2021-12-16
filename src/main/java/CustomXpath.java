public class CustomXpath {

    public static void main(String[] args) {

        // Xpath is not a attribute in HTML DOM

        //xpath are of two types 1.absolute & 2.relative

        //abs xpath: //html/body/div[2]/div/div[3]/div[4]/div/input

        //relative xpath: custom xpath funtions & axes

        //htmltag[@attribut='value']    (attribute can be anything not only.class .id .linktext)
        //htmltag[@attribut1='value' and @attribute2='value']
        //span[@class='nav-label' and text()='Platform']
        //span[text()='Platform and @class]
        //span[@id or @class]

        // text()  function usage
        //span[text()='Company']    (When only Text is available)
        //htmltag[@attribute='value' and text()='value']    (Text Functions with attribute)


        // contains()  function used for dynamic attributes or dynamic text
        //htmltag[contains(@attribute,'value' and @attribute,'vlaue')]
        //span[contains(text(), 'Resources')]    (contains with text function)
        //span[contains(text(), 'Resou')]        (This one is same as above)
        //a[contains(text(),'Support') and @class='nav-label']    (Contains applied only on text function)
        //a[contains(text(),'Customers') and contains(@href,'/customers/') and @class='nav-label']    (Contains applied on two attributes & third without contains)


        //div[@class='lazy-image-wrapper loaded']   (with xpath u can use the class attribute with all the classes where as with By.class u can only use one class)




    }

}
