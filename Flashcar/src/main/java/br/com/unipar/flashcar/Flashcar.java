package br.com.unipar.flashcar;

import br.com.unipar.flashcar.exceptions.DescricaoInvalidaException;
import br.com.unipar.flashcar.models.Cor;
import br.com.unipar.flashcar.models.Marca;
import br.com.unipar.flashcar.models.Modelo;
import br.com.unipar.flashcar.services.CorService;
import br.com.unipar.flashcar.services.MarcaService;
import br.com.unipar.flashcar.services.ModeloService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Flashcar {

    public static void main(String[] args) {
        try {
            
            System.out.println("COR:");
            Cor azul = new Cor();
            azul.setDescricao("Azul");
            CorService corService = new CorService();
            corService.insert(azul);
            ArrayList<Cor> listaCor = corService.findAll();
            System.out.println(listaCor.toString());
            
            System.out.println("\nMODELO:");
            Modelo modelo = new Modelo();
            modelo.setAno(2000);
            modelo.setCombustivel("Flex");
            modelo.setDescricao("Modelo Descrição");
            modelo.setCor_id(1);
            modelo.setPortas(4);
            
            ModeloService modeloService = new ModeloService();
            modeloService.insert(modelo);
            
            ArrayList<Modelo> listaModelo = modeloService.findAll();
            System.out.println(listaModelo.toString());
            
            System.out.println("\nUPDATE:");
            modelo.setAno(2001);
            modelo.setDescricao("Alterado Modelo Descrição");
            modeloService.update(modelo);
            
            listaModelo = modeloService.findAll();
            System.out.println(listaModelo.toString());
            
            System.out.println("\nFIND BY ID:");
            modelo = modeloService.findById(4,1);
            System.out.println(modelo.toString());
            
            System.out.println("\nMARCA:");
            Marca marca = new Marca();
            marca.setDescricao("Marca Descrição");
            marca.setModelo_id(1);
            
            MarcaService marcaService = new MarcaService();
            marcaService.insert(marca);
            ArrayList<Marca> listaMarca = marcaService.findAll();
            System.out.println(listaMarca.toString());
            
            System.out.println("\nUPDATE:");
            marca.setDescricao("Alterada Marca Descrição");
            marcaService.update(marca);
            
            listaMarca = marcaService.findAll();
            System.out.println(listaMarca.toString());
            
            System.out.println("\nFIND BY ID:");
            marca = marcaService.findById(1,1);
            System.out.println(marca.toString());
            
            System.out.println("\n--------------------------------");
            
        } catch (DescricaoInvalidaException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
