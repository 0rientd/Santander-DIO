//-- Video Aula 1
//--
//-- Média aritmética

let notas = [5.0, 7.0, 10.0, 3.0]
var media = Double()

for nota in notas {
    media += nota
}

media = media / Double(notas.count)
