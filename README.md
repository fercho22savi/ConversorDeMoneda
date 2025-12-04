# 💱 Conversor de Monedas con API y GUI Moderna

Este proyecto es un **Conversor de Monedas** desarrollado en **Java**, que consume una **API de tipos de cambio en tiempo real** y presenta una interfaz moderna utilizando **Swing** con un estilo oscuro.  
El sistema permite convertir entre diferentes divisas e incluye **banderas representativas** de cada moneda para una experiencia visual más intuitiva.

---

## 🚀 Características principales

✅ Interfaz moderna con estilo **dark mode**  
✅ Soporte para múltiples monedas (USD, EUR, COP, GBP, MXN, BRL, ARS)  
✅ Consumo de una **API REST** para obtener tasas actualizadas  
✅ Visualización de **banderas en los selectores** de moneda  
✅ Cálculo automático del tipo de cambio  
✅ Arquitectura organizada por paquetes:
- `api` → conexión con la API de conversión  
- `gui` → interfaz gráfica y renderizado de banderas  
- `modelo` → clase que representa una moneda  
- `principal` → clase principal del programa
  Captures<br>
  <img width="485" height="338" alt="principal" src="https://github.com/user-attachments/assets/b43db282-b363-427b-bc91-e338130ae754" /><br>
  <img width="487" height="336" alt="convercioncop-usd" src="https://github.com/user-attachments/assets/a6e88194-2330-4d1c-b9f5-b8ed23e4a8cf" /><br>
  <img width="487" height="343" alt="conversionbrl-usd" src="https://github.com/user-attachments/assets/a90228d9-2ec4-4b08-865e-7c908169cbf1" /><br>
  <img width="487" height="338" alt="cop-brl" src="https://github.com/user-attachments/assets/ad478ad2-60e1-4d05-b3ed-2b9fc2abbf71" /><br>
  <img width="488" height="339" alt="euro-usd" src="https://github.com/user-attachments/assets/bbeae0f1-f431-4b0c-b748-b7c2e68801dc" /><br>
  <img width="482" height="343" alt="usd-brl" src="https://github.com/user-attachments/assets/a202e26c-1808-43a9-bff0-68a08f3806a6" /><br>
  <img width="268" height="122" alt="excepcion1" src="https://github.com/user-attachments/assets/959f5f9e-be24-42ab-86f3-2c108192e8b5" /><br>
  <img width="266" height="119" alt="excepcion2" src="https://github.com/user-attachments/assets/d141e5de-35cf-4d75-a47c-84435da006a9" /><br>

---

## 🧠 Tecnologías utilizadas

- **Java 17+**
- **Swing / AWT** (Interfaz gráfica)
- **HTTPClient** (para consumir la API)
- **Gson** (parseo de JSON)
- **flatlaf-3.0.jar**(Es una librería externa que cambia la apariencia clásica de Swing (gris, cuadrada y antigua)<br>
- a un estilo moderno tipo "dark mode", similar a interfaces de aplicaciones actuales.)
- **IntelliJ IDEA** (IDE de desarrollo)
- **REST API** pública de conversión de divisas

---

## 🧩 Estructura del proyecto
<img width="423" height="592" alt="estructura1" src="https://github.com/user-attachments/assets/801fc750-3fae-46f3-9466-45999710b649" /><br>
<img width="428" height="265" alt="estructura2" src="https://github.com/user-attachments/assets/1583848f-de2d-4ace-8bf9-cafe5efeaa64" /><br>



🌐 API utilizada<br>

El proyecto consume datos de una API pública de tasas de cambio (como ExchangeRate API
 o similar).<br>
Esto permite mantener actualizadas las conversiones sin necesidad de actualizar el programa manualmente.<br>

🎨 Diseño<br>

Paleta de colores: tonos oscuros con contraste suave<br>

Tipografía moderna y legible<br>

Íconos de banderas adaptados y escalados para el menú de selección<br>

Fuente visual similar a aplicaciones de escritorio modernas<br>

👨‍💻 Autor

Fernando Saldaña<br>
📍 Bogotá, Colombia<br>
🎓 Tecnólogo en Análisis y Desarrollo de Sistemas de Información - SENA<br>
💻 Desarrollador Java | Entusiasta de la ciberseguridad | Apasionado por la ingeniería de software<br>

🧾 Licencia<br>

Este proyecto se distribuye bajo la licencia MIT, lo que significa que puedes usarlo, modificarlo y compartirlo libremente citando al autor original.<br>

⭐ Si te gustó este proyecto, ¡no olvides dejar una estrella en el repositorio!<br>
