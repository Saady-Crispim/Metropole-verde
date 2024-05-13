package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Alerts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class JogadaController implements Initializable {

	@FXML
	private ImageView imgCasaComp1;
	@FXML
	private ImageView imgCasaComp2;
	@FXML
	private ImageView imgHorta1;
	@FXML
	private ImageView imgHorta2;
	@FXML
	private ImageView imgTecelagem1;
	@FXML
	private ImageView imgTecelagem2;
	@FXML
	private ImageView imgFundicao1;
	@FXML
	private ImageView imgFundicao2;
	@FXML
	private ImageView imgHidreletrica1;
	@FXML
	private ImageView imgHidreletrica2;
	@FXML
	private ImageView imgEolica1;
	@FXML
	private ImageView imgEolica2;

	@FXML
	private Label lblPontuacao1;
	@FXML
	private Label lblPontuacao2;
	@FXML
	private Label lblTop1;
	@FXML
	private Label lblTop2;
	@FXML
	private Label lblMadeira;
	@FXML
	private Label lblMinerio;
	@FXML
	private Label lblJogador;
	@FXML
	private Label lblRound;

	@FXML
	private Button btnColeta;
	@FXML
	private Button btnVoltar;
	@FXML
	private Button btnCasacomp;
	@FXML
	private Button btnHorta;
	@FXML
	private Button btnTecelagem;
	@FXML
	private Button btnFundicao;
	@FXML
	private Button btnHidreletrica;
	@FXML
	private Button btnEolica;
	@FXML
	private Button btnMenu;

	private int jogadorAtual = 1;
	private int roundAtual = 1;

	private JogoModel jogoModel = new JogoModel();
	private Construcao construcao = new Construcao(jogoModel);
	private Pontuacao pontuacao = Pontuacao.getInstance();

	public void atualizarLabels() {
		if (jogadorAtual == 1) {
			lblMadeira.setText("Madeira: " + jogoModel.getMadeiraJogador1());
			lblMinerio.setText("Minério: " + jogoModel.getMinerioJogador1());
		} else {
			lblMadeira.setText("Madeira: " + jogoModel.getMadeiraJogador2());
			lblMinerio.setText("Minério: " + jogoModel.getMinerioJogador2());
		}
		lblJogador.setText("Jogador " + jogadorAtual);
		lblRound.setText("Rodada " + roundAtual);
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		if (url.getPath().contains("JogadaView.fxml")) {
			atualizarLabels();
		}
	}

	@FXML
	public void onColetaAction(ActionEvent event) {

		if (roundAtual <= 7) {
			if (jogadorAtual == 1) {
				jogoModel.coletarRecursosJogador1();
			} else {
				jogoModel.coletarRecursosJogador2();
			}
			if (jogadorAtual == 1) {
				roundAtual++;
			}
		} else {
			irParaFinal(event);
		}
		jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
		atualizarLabels();
	}

	public void onCasaCompAction(ActionEvent event) {
		if (roundAtual <= 7) {
			if (jogadorAtual == 1) {
				if (construcao.getCasacomp1() == false) {
					if (jogoModel.getMadeiraJogador1() < 200 || jogoModel.getMinerioJogador1() < 200) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 1", AlertType.ERROR);
					} else {
						construcao.casacomp1();
						pontuacao.setPontuacao1(pontuacao.getPontuacao1() + 350);
						imgCasaComp1.setOpacity(1);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 1, já possui a Propriedade 'casa de compostagem'",
							AlertType.ERROR);
				}
			} else {
				if (construcao.getCasacomp2() == false) {
					if (jogoModel.getMadeiraJogador2() < 200 || jogoModel.getMinerioJogador2() < 200) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 2", AlertType.ERROR);
					} else {
						construcao.casacomp2();
						pontuacao.setPontuacao2(pontuacao.getPontuacao2() + 350);
						imgCasaComp2.setOpacity(1);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 2, já possui a Propriedade 'casa de compostagem'",
							AlertType.ERROR);
				}
			}
		} else {
			irParaFinal(event);
		}
		atualizarLabels();
	}

	public void onEolicaAction(ActionEvent event) {
		if (roundAtual <= 7) {
			if (jogadorAtual == 1) {
				if (construcao.getEolica1() == false) {
					if (jogoModel.getMadeiraJogador1() < 500 || jogoModel.getMinerioJogador1() < 450) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 1", AlertType.ERROR);
					} else {
						construcao.eolica1();
						pontuacao.setPontuacao1(pontuacao.getPontuacao1() + 400);
						imgEolica1.setOpacity(1);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 1, já possui a Propriedade 'eólica'", AlertType.ERROR);
				}
			} else {
				if (construcao.getEolica2() == false) {
					if (jogoModel.getMadeiraJogador2() < 500 || jogoModel.getMinerioJogador2() < 450) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 2", AlertType.ERROR);
					} else {
						construcao.eolica2();
						pontuacao.setPontuacao2(pontuacao.getPontuacao2() + 400);
						imgEolica2.setOpacity(1);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 2, já possui a Propriedade 'eólica'", AlertType.ERROR);
				}
			}
		} else {
			irParaFinal(event);
		}
		atualizarLabels();
	}

	public void onFundicaoAction(ActionEvent event) {
		if (roundAtual <= 7) {
			if (jogadorAtual == 1) {
				if (construcao.getFundicao1() == false) {
					if (jogoModel.getMadeiraJogador1() < 400 || jogoModel.getMinerioJogador1() < 350) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 1", AlertType.ERROR);
					} else {
						construcao.fundicao1();
						pontuacao.setPontuacao1(pontuacao.getPontuacao1() + 100);
						imgFundicao1.setOpacity(1);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 1, já possui a Propriedade 'fundição'", AlertType.ERROR);
				}
			} else {
				if (construcao.getFundicao2() == false) {
					if (jogoModel.getMadeiraJogador2() < 400 || jogoModel.getMinerioJogador2() < 350) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 2", AlertType.ERROR);
					} else {
						construcao.fundicao2();
						imgFundicao2.setOpacity(1);
						pontuacao.setPontuacao2(pontuacao.getPontuacao2() + 100);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 2, já possui a Propriedade 'fundição'", AlertType.ERROR);
				}
			}
		} else {
			irParaFinal(event);
		}
		atualizarLabels();
	}

	public void onTecelagemAction(ActionEvent event) {
		if (roundAtual <= 7) {
			if (jogadorAtual == 1) {
				if (construcao.getTecelagem1() == false) {
					if (jogoModel.getMadeiraJogador1() < 350 || jogoModel.getMinerioJogador1() < 300) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 1", AlertType.ERROR);
					} else {
						construcao.tecelagem1();
						pontuacao.setPontuacao1(pontuacao.getPontuacao1() + 320);
						imgTecelagem1.setOpacity(1);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 1, já possui a Propriedade 'tecelagem'", AlertType.ERROR);
				}
			} else {
				if (construcao.getTecelagem2() == false) {
					if (jogoModel.getMadeiraJogador2() < 350 || jogoModel.getMinerioJogador2() < 300) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 2", AlertType.ERROR);
					} else {
						construcao.tecelagem2();
						pontuacao.setPontuacao2(pontuacao.getPontuacao2() + 320);
						imgTecelagem2.setOpacity(1);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 2, já possui a Propriedade 'tecelagem'", AlertType.ERROR);
				}
			}
		} else {
			irParaFinal(event);
		}
		atualizarLabels();
	}

	public void onHortaAction(ActionEvent event) {
		if (roundAtual <= 7) {
			if (jogadorAtual == 1) {
				if (construcao.getHorta1() == false) {
					if (jogoModel.getMadeiraJogador1() < 300 || jogoModel.getMinerioJogador1() < 250) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 1", AlertType.ERROR);
					} else {
						construcao.horta1();
						pontuacao.setPontuacao1(pontuacao.getPontuacao1() + 230);
						imgHorta1.setOpacity(1);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 1, já possui a Propriedade 'horta'", AlertType.ERROR);
				}
			} else {
				if (construcao.getHorta2() == false) {
					if (jogoModel.getMadeiraJogador2() < 300 || jogoModel.getMinerioJogador2() < 250) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 2", AlertType.ERROR);
					} else {
						construcao.horta2();
						pontuacao.setPontuacao2(pontuacao.getPontuacao2() + 230);
						imgHorta2.setOpacity(1);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 2, já possui a Propriedade 'horta'", AlertType.ERROR);
				}
			}
		} else {
			irParaFinal(event);
		}
		atualizarLabels();
	}

	public void onHidreletricaAction(ActionEvent event) {
		if (roundAtual <= 7) {
			if (jogadorAtual == 1) {
				if (construcao.getHidreletrica1() == false) {
					if (jogoModel.getMadeiraJogador1() < 450 || jogoModel.getMinerioJogador1() < 400) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 1", AlertType.ERROR);
					} else {
						construcao.hidreletrica1();
						imgHidreletrica1.setOpacity(1);
						pontuacao.setPontuacao1(pontuacao.getPontuacao1() + 400);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 1, já possui a Propriedade 'hidrelétrica'",
							AlertType.ERROR);
				}
			} else {
				if (construcao.getHidreletrica2() == false) {
					if (jogoModel.getMadeiraJogador2() < 450 || jogoModel.getMinerioJogador2() < 400) {
						Alerts.showAlert("Error", null, "Recursos Insuficientes para o Jogador 2", AlertType.ERROR);
					} else {
						construcao.hidreletrica2();
						pontuacao.setPontuacao2(pontuacao.getPontuacao2() + 400);
						imgHidreletrica2.setOpacity(1);
						roundAtual++;
						jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
					}
				} else {
					Alerts.showAlert("Error", null, "Jogador 2, já possui a Propriedade 'hidrelétrica'",
							AlertType.ERROR);
				}
			}
		} else {
			irParaFinal(event);
		}
		atualizarLabels();
	}

	@FXML
	public void onVoltarAction(ActionEvent event) {
		irParaView(event, "/gui/View.fxml");
	}

	private void irParaFinal(ActionEvent event) {
		Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/gui/final.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void irParaView(ActionEvent event, String viewPath) {
		Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource(viewPath));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
