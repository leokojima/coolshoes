package br.com.fiap.coolshoes.service;

import br.com.fiap.coolshoes.dto.ProductPriceUpdateDTO;
import br.com.fiap.coolshoes.dto.ProductCreateUpdateDTO;
import br.com.fiap.coolshoes.dto.ProductDTO;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Override
    public List<ProductDTO> findAll(Integer numero) {
        return null;
    }

    @Override
    public ProductDTO findById(Long id) {
        return null;
    }

    @Override
    public ProductDTO create(ProductCreateUpdateDTO productCreateUpdateDTO) {
        return null;
    }

    @Override
    public ProductDTO update(Long id, ProductCreateUpdateDTO productCreateUpdateDTO) {
        return null;
    }

    @Override
    public ProductDTO updatePrice(Long id, ProductPriceUpdateDTO productPriceUpdateDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        
    }

}
