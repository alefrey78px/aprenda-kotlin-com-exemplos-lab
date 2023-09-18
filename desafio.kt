// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO, INSANO }

enum class Sexo { MASCULINO, FEMININO }

class Usuario(val nome: String, val idade: Int, val sexo: Sexo) {

    fun imprimeUsuario() : String {
        return "Nome: ${nome}\nIdade: ${idade}\nSexo: ${sexo}\n"
    }
}

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }

}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    // criando conteudos educacionais
    val conteudo01 = ConteudoEducacional("Aprendendo Kotlin")
    val conteudo02 = ConteudoEducacional("Sintaxe Basica")
    val conteudo03 = ConteudoEducacional("Funcoes", 200)
    val conteudo04 = ConteudoEducacional("Classes", 900)

    // criando formacoes
    val formacaoBasica = Formacao(
        "Iniciante em Kotlin",
        nivel = Nivel.BASICO,
        listOf(conteudo01, conteudo02)
    )

    val formacaoAvancada = Formacao(
        "Mestre em Kotlin",
        Nivel.AVANCADO,
        listOf(conteudo01, conteudo02, conteudo03, conteudo04)
    )

    // criando usuarios
    val usuario01 = Usuario("Alexandre", 45, Sexo.MASCULINO )
    val usuario02 = Usuario("Sonia", 43, Sexo.FEMININO )

    // matriculando usuarios
    formacaoBasica.matricular(usuario01)
    formacaoAvancada.matricular(usuario02)

    // listando formacoes
    println("--- Lista de Formacoes ---")
    println(formacaoBasica)
    println(formacaoAvancada)


    // imprimindo usuarios
    println("--- Lista de Usuarios --- ")
    println(usuario01.imprimeUsuario())
    println(usuario02.imprimeUsuario())
}
