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

        // --- XPath indexing --//

        //  (//div[contains(@class,'form-field')])[3]    (3rd in the Index out of 6 Elements with same Class)

        //input[starts-with(@name,'ph')]    (Starts with function, here name is starting name attribute is phone and hence ph is the starting two letters

        //select[@name='query-contact']/option  (Single Slash gives direct child (/option) & double slash gives all the childs direct + indirect )


        // Backward Traversing

        //a[@class='nav-label' and @href='/customers/']/..    (for going from Child to parent)

        //a[@class='nav-label' and @href='/customers/']/parent::li  (this way as well u can transverse from child to parent)

        //strong[text()='Email:']/ancestor::div   (this way as well u can transverse from child to ancestor)

        // Parent to Child transversing

        //select[@name='query-contact']//child::option[@value='Sales']   (This way as well u can transverse from parent to child)

        //select[@name='query-contact']/child::option[@value='Sales']  (This as well u will get above selection using sigle slash as option is direct Child of select )


        // Preceding & Following

        //textarea[@class='message-form']//preceding::div   (This will give all the preceeding divs to the textarea tag)

        //input[@class='first-name-form']//following::div    (This will give all the following divs to the input tag)






    }

}
