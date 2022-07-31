package dev.wakandaacademy.produdoro.usuario.domain;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ConfiguracaoUsuario {
	private Integer tempoMinutosFoco;
	private Integer tempoMinutosPausaCurta;
	private Integer tempoMinutosPausaLonga;
	private Integer repeticoesParaPausaLonga;
	
	public ConfiguracaoUsuario(ConfiguracaoPadrao configuracaoPadrão) {
		this.tempoMinutosFoco = configuracaoPadrão.getTempoMinutosFoco();
		this.tempoMinutosPausaCurta = configuracaoPadrão.getTempoMinutosPausaCurta();
		this.tempoMinutosPausaLonga = configuracaoPadrão.getRepeticoesParaPausaLonga();
		this.repeticoesParaPausaLonga = configuracaoPadrão.getRepeticoesParaPausaLonga();
	}
	
}
