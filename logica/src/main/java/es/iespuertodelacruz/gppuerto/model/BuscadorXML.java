package es.iespuertodelacruz.gppuerto.model;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Clase con los metodos para la transformacion de XML a objeto y viceversa de la clase Buscador
 */
public class BuscadorXML {
    private String textoXML;

    /**
     * Metodo para obtener en un String con el objeto en formato XML
     * @param buscador Objeto de la clase Buscador
     * @return String en formato XML del objeto Buscador
     * @throws JAXBException
     */
    public String buscadorToXml(Buscador buscador) throws JAXBException {
        textoXML = null;
        try {
            JAXBContext context = JAXBContext.newInstance(Buscador.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            marshaller.marshal(buscador, sw);
            textoXML = sw.toString();
        } catch (JAXBException ex) {
            System.out.println(ex);
        } finally {
            return textoXML;
        }
    }

    /**
     * Metodo para obtener en formato objeto el objeto Buscador en formato XML
     * @param xmlBuscador String con el objeto buscador en formato XML
     * @return Objeto de la clase Buscador
     */
    public Buscador xmlToBuscador(String xmlBuscador) {
        Buscador buscador = null;
        try {
            StringReader sr = new StringReader(xmlBuscador);
            JAXBContext contexto = JAXBContext.newInstance(Buscador.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE);
            Unmarshaller unmarshaller = contexto.createUnmarshaller();
            buscador = (Buscador) unmarshaller.unmarshal(sr);
        } catch (JAXBException ex) {
            System.out.println(ex);
        } finally {
            return buscador;
        }
    }
}
