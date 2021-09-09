package loja;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Principal {
	
	public static void main(String[] args) {
		
		
		//INFORMA��ES PESSOAIS CLIENTE
	
		
		Clientes infoPessoais = new Clientes();
		
		infoPessoais.nomeCompleto = "Fernando da Silva";
		infoPessoais.rg = "4433651837";
		infoPessoais.cpf = "585166549-73";
		infoPessoais.telefone = "(51)98204749";
		
		System.out.println("-> Informa��es Pessoais do Cliente <-");
		System.out.println("Nome Completo: "+infoPessoais.nomeCompleto);
		System.out.println("RG: "+infoPessoais.rg);
		System.out.println("CPF: "+infoPessoais.cpf);
		System.out.println("Telefone: "+infoPessoais.telefone);
	
		
		//INFORMA��ES ENDERE�O CLIENTE
		
		Endereco end1 = new Endereco();
		end1.estado = "Rio Grande do Sul";
		end1.cidade = "Porto Alegre";
		end1.bairro = "Teres�polis";
		end1.rua = "Av.Teres�polis";
		end1.numero = "600";
		end1.cep = "908700-000";
		
		Clientes client1 = new Clientes();
		client1.endereco = end1;
		
		System.out.println("-> Endere�o do cliente <-");
		System.out.println("Estado: "+client1.endereco.estado);
		System.out.println("Cidade: " +client1.endereco.cidade);
		System.out.println("Bairro: " +client1.endereco.bairro);
		System.out.println("Rua: " +client1.endereco.rua);
		System.out.println("N�mero: " +client1.endereco.numero);
		System.out.println("CEP: " +client1.endereco.cep);
		

		
		//INFORMA��ES PESSOAIS VENDEDOR(A)
		
		Vendedores infoVend = new Vendedores();
		
		infoVend.nomeCompleto = "Juliana Rodrigues";
		infoVend.rg = "64513792";
		infoVend.cpf = "545266018-60";
		infoVend.telefone = "(51)996621367";
		infoVend.salario = "R$2490,00";
		
		System.out.println("-> Informa��es Pessoais Vendedor(a) <-");
		System.out.println("Nome Completo: "+infoVend.nomeCompleto);
		System.out.println("RG: "+infoVend.rg);
		System.out.println("CPF: "+infoVend.cpf);
		System.out.println("Telefone: "+infoVend.telefone);
		System.out.println("Sal�rio: "+infoVend.salario);
		
				
		//INFORMA��ES ENDERE�O VENDEDOR(A)
		
		Endereco end2 = new Endereco();
		end2.estado = "Rio Grande do Sul";
		end2.cidade = "Porto Alegre";
		end2.bairro = "Centro Hist�rico";
		end2.rua = "Rua 7 de Setembro";
		end2.numero = "709";
		end2.cep = "90010-190";
		
		Vendedores vend1 = new Vendedores();
		vend1.endereco = end2;
		
		System.out.println("-> Endere�o do Vendedor(a) <-");
		System.out.println("Estado: "+vend1.endereco.estado);
		System.out.println("Cidade: " +vend1.endereco.cidade);
		System.out.println("Bairro: " +vend1.endereco.bairro);
		System.out.println("Rua: " +vend1.endereco.rua);
		System.out.println("N�mero: " +vend1.endereco.numero);
		System.out.println("CEP: " +vend1.endereco.cep);
		
		
		
		//INFORMA��O FORNECEDORES
		
		Fornecedores fornInfo = new Fornecedores();
		fornInfo.nomeFornecedor = "Tiago Wagner";
		fornInfo.tipoProduto = "Caixa de som";
		LocalDate dataPedido = LocalDate.of(2021, 8, 24);
		int quantProduto = 15;
		
		
		System.out.println("-> Informa��es Fornecedor <-");
		System.out.println("Nome: "+fornInfo.nomeFornecedor);
		System.out.println("Produto: "+fornInfo.tipoProduto);
		System.out.println("Data do pedido: "+dataPedido);
		System.out.println("Quantidade dispon�vel: "+quantProduto);
		
		
		
		//INFORMA��O ESTOQUE
		
		Estoque infoEstoque = new Estoque();
		infoEstoque.produto = "Caixa de som";
		infoEstoque.tipo = "Audio e Video";
		int quantidade = 14;
		infoEstoque.serial = "529735814";
		
		System.out.println("-> Informa��o Estoque <-");
		System.out.println("Produto: "+infoEstoque.produto);
		System.out.println("Categoria: "+infoEstoque.tipo);
		System.out.println("Quantidade em estoque: "+quantidade);
		System.out.println("Seria: "+infoEstoque.serial);
		
		
		
		//INFORMA��O PRODUTOS
		
		Produtos infoProdutos = new Produtos();
		infoProdutos.marca = "JBL";
		float peso = (float) 17.4;
		infoProdutos.codigodeBarras = "6925281973956";
		infoProdutos.garantia = "12 meses";
		
		System.out.println("-> Informa��o Produto <-");
		System.out.println("Marca: "+infoProdutos.marca);
		System.out.println("Peso: "+peso);
		System.out.println("C�digo de Barras: "+infoProdutos.codigodeBarras);
		System.out.println("Garantia: "+infoProdutos.garantia);
		
		
		
		//INFORMA��O TRANSPORTADORA
		
		Transportadora infoTransp = new Transportadora();
		
		infoTransp.nomeTransportadora = "Reiter Log";
		infoTransp.nomeMotorista = "Jo�o Felipe";
		infoTransp.placaVeiculo = "INF 5A27";
		LocalDateTime dataEntrega = LocalDateTime.of(2021, 8, 27, 16, 53);
				
		
		System.out.println("-> Informa��o Transportadora <-");
		System.out.println("Transportadora: "+infoTransp.nomeTransportadora);
		System.out.println("Motorista: "+infoTransp.nomeMotorista);
		System.out.println("Placa Veiculo: "+infoTransp.placaVeiculo);
		System.out.println("Data entrega: "+dataEntrega);
		
		
		
		//INFORMA��O VENDAS
	
		Vendas infoVendas = new Vendas();
		
		infoVendas.valor = "500,00";
		infoVendas.formaPagamento = "� vista";
		LocalDateTime diahoraVenda = LocalDateTime.of(2021, 9, 5 , 15, 26);
		
		System.out.println("-> Informa��es de Vendas <-");
		System.out.println("Valor: "+infoVendas.valor);
		System.out.println("Forma de Pagamento: "+infoVendas.formaPagamento);
		System.out.println("Dia e Hora da Venda: "+diahoraVenda);

	}
}
