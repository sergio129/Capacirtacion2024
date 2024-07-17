Feature: Llenar formulario de practica

  #@Prueba1
  #Scenario Outline: Completar y llenar el formulario
    #Given que estoy en la página del formulario de práctica
    #When Lleno el formulario con los siguientes datos <fistName><lastName><userEmail><userNumber>
    #Then  el formulario se envia correctamente
    #Examples:
     # | fistName | lastName | userEmail         | userNumber |
     # | Leidy    | Iral     | leidy@pruebas.com | 123456789  |

  #@Prueba2
  #Scenario: Completar y llenar el formulario
   # Given Estoy en la pagina del fomulario de practica
    #When Lleno el formulario con los siguientes datos fistName:"Leidy" lastName:"Iral" userEmail:"leidy@pruebas.com" userNumber:"123456789"
    #Then  el formulario se envia correctamente

  @Prueba3
  Scenario: Completar y llenar el formulario
    Given que estoy en la página del formulario de práctica
    When Lleno el formulario con los siguientes datos
      | campo          | valor                                   |
      | firstName      | Leydi                                   |
      | lastName       | Iral                                    |
      | userEmail      | leidy@pruebas.com                       |
      | gender         | Male                                    |
      | userNumber     | 1234567890                              |
      | dateOfBirth    | 15 May 1990                             |
      | subjects       | Maths                                   |
      | hobbies        | Sports, Reading                         |
      | picture        | C:\Users\Sergio\Pictures\IMG_0010.JPG |
      | currentAddress | 123 Main St, Anytown                    |
      | state          | NCR                                     |
      | city           | Delhi                                   |
    Then el formulario se envía correctamente
