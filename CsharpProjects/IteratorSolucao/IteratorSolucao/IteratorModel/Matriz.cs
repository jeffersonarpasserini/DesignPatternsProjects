using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IteratorSolucao.IteratorModel
{
    public class Matriz : Agregado
    {
        private int[,] matriz;
        public int quatidadeLinhas { get; set; }
        public int quantidadeColunas { get; set; }
        public int linhaAtual { get; set; }
        public int colunaAtual { get; set; }

        public Matriz(int qtdLinhas, int qtdColunas)
        {
            matriz = new int[qtdLinhas,qtdColunas];
            this.quatidadeLinhas = qtdLinhas;
            this.quantidadeColunas = qtdColunas;
        }

        public int getItem(int linha, int coluna)
        {
            return this.matriz[linha,coluna];
        }

        public int getQuantidadeLinhas()
        {
            return this.quatidadeLinhas;
        }

        public Boolean addItem(int item)
        {
            //se chegou a ultima linha e coluna
            if (this.linhaAtual == (this.quatidadeLinhas) &&
                this.colunaAtual == (this.quantidadeColunas))
            {
                return false;
            }
            //se chegou na ultima coluna
            if (this.colunaAtual == (this.quantidadeColunas))
            {
                this.linhaAtual += 1;
                this.colunaAtual = 0;
            }
            //insere item
            this.matriz[this.linhaAtual, this.colunaAtual] = item;
            this.colunaAtual += 1;
            return true;
        }

        public int getQuantidadeColunas()
        {
            return this.quantidadeColunas;
        }

        public Iterator createIterator()
        {
            return new MatrizIterator(this);
        }
    }
}
