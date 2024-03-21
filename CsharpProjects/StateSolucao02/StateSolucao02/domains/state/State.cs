using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StateSolucao02.domains.state
{
    public interface State
    {
        public void sucessoAoPagar();
        public void cancelarPedido();
        public void despacharPedido();

    }
}
