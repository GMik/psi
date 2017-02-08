
package com.neweducation.application.surveyhandling;

        import com.neweducation.application.controllers.AbstractController;
        import com.neweducation.application.external.IStudyDescriptionProviderService;
        import com.neweducation.application.external.MockStudyDescriptionProviderService;
        import com.neweducation.application.security.NotAuthenticatedException;
        import dtos.UserTo;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Maciej Wolański
 * maciekwski@gmail.com
 * on 08.02.2017.
 */
public class SurveyController extends AbstractController {


    // zaciagniecie wszystkich sondazy, input - userid

    // wybor specjalnosci - input: userid, sondazid, wybor(string, nazwa
    // specjalnosci)

    // opis specjalnosci - ZAMOCKOWANE - externale, input - idspecjalnosci
    IStudyDescriptionProviderService descriptionProviderService = new MockStudyDescriptionProviderService();
    @RequestMapping(value = "/surveys/{studyId}/getStudyDescription", method = RequestMethod.POST)
    public ResponseEntity<String> acceptDesignation(@RequestParam(value = "studyId") int studyId, String authToken) {
        UserTo user = null;
        try {
            user = authenticator.authenticateUser("123");
        } catch (NotAuthenticatedException e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        return ResponseEntity.ok().body(this.descriptionProviderService.getStudyDescription(studyId));
    }
}
