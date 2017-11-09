package com.example.fabianlopezmagnan.horoscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {
    TextView saludo,signo,texto;
    Button consultar;
    ImageView animal;
    String nombre;
    String anio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        saludo = (TextView) findViewById(R.id.saludo);
        signo = (TextView) findViewById(R.id.signo);
        texto = (TextView) findViewById(R.id.texto);
        animal =(ImageView) findViewById(R.id.animal);
        consultar = (Button) findViewById(R.id.consultar);
        nombre=getIntent().getStringExtra("nombre");
        saludo.setText("Bienvenido/(a): "+nombre);
        anio = getIntent().getStringExtra("anio");
        int age = Integer.parseInt(anio);
        int resultado = age%12;
        sig(resultado);
        consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Inicio.this,Consulta.class);
                startActivity(i);
            }
        });
    }

    public void sig(int resultado){
        switch (resultado){
            case 0:
                animal.setImageResource(R.drawable.mono);
                signo.setText("Tu signo es: Mono");
                texto.setText("En asuntos del corazón debes ser muy delicado y obrar con tacto y sensibilidad. Un amigo te confiará un secreto que debes guardar porque podría comprometer tu relación actual. No te conviene divulgar algo ajeno a tu pareja porque en estos momentos no sería procedente y terminarías creando fricciones en tu relación. Un cambio es posible, quizás a última hora y puede tomarte totalmente desprevenido. Por eso, y a fin de evitarte contratiempos, ten una pequeña reserva de dinero separada para lo inesperado y así las contrariedades serán menores.");
                break;
            case 1:
                animal.setImageResource(R.drawable.gallo);
                signo.setText("Tu signo es: Gallo");
                texto.setText("Este será un mes inolvidable para ti, Gallo, puesto que el día 28 comienza a regir tu signo chino, el Gallo de Fuego y se inicia una etapa de transformaciones totales en tu vida. Trabaja en el presente, que es tu realidad, por supuesto, pero no pierdas la visión de futuro y desde este mismo momento plantéate a ti mismo otras metas más altas de superación a fin de mejorar tus condiciones laborales en los próximos meses. Estás recibiendo una onda planetaria que te ayudará mucho a recuperar tu energía si has sufrido en días pasados algún trastorno relacionado con tu sistema digestivo o estás padeciendo de constipación o dolores abdominales crónicos.");
                break;
            case 2:
                animal.setImageResource(R.drawable.perro);
                signo.setText("Tu signo es: Perro");
                texto.setText("Tu mundo interior se estremece ante la posibilidad de una boda, compromiso serio, noviazgo o unión libre con otra persona. Antes de dar ese paso tan importante en tu vida cerciórate de que es ese precisamente tu interés genuino. Hay buenos efluvios ambientales asociados a viajes y cruceros, contactos con personalidades del mundo del arte y la farándula así como comerciantes y vendedores. En todas estas reuniones hay futuro para ti y desarrollo económico.");
                break;
            case 3:
                animal.setImageResource(R.drawable.chancho);
                signo.setText("Tu signo es: Cerdo");
                texto.setText("Te asombrarás de cómo tu vida amorosa se encauza en un sentido positivo y el amor adquiere una nueva dimensión, algo que se consolidará en este mes a partir del inicio del Año del Gallo de Fuego el día 28 de enero. Aprovecha las circunstancias favorables que ahora están surgiendo en tu trabajo y este mes haz los contactos pertinentes para obtener ese empleo que buscas y mejorar tu posición laboral dentro de tu empresa. Es tu mes ideal para organizarte. Estás en un ciclo delicado y no te conviene excederte en lo que comas o bebas pues podrías complicar tu metabolismo y causarte trastornos digestivos.");
                break;
            case 4:
                animal.setImageResource(R.drawable.rata);
                signo.setText("Tu signo es: Rata");
                texto.setText("Estás lleno de ilusiones. Tu vida amorosa está dibujándose gratamente en tu panorama sentimental y te sientes más seguro de tus emociones y en control de tu presente, pero tu impulsividad podría sacarte de tu centro. Este mes conquistas nuevas amistades y si dejas a un lado el tono pesimista y abordas las relaciones sociales con un tono más festivo y relajado aumentarás tu gracia personal y esto te ayudará mucho a la hora de empezar un negocio con otros o una nueva relación.");
                break;
            case 5:
                animal.setImageResource(R.drawable.bufalo);
                signo.setText("Tu signo es: Bufalo");
                texto.setText("El amor se reviste con un tono fresco y dinámico en esta etapa y si estás soltero o soltera no te preocupes porque después que comience el Mes del Gallo, en unos días, tu signo Buey estará viviendo romances inesperados. Durante este mes del Tigre evita acudir a las píldoras para dormir porque el sueño no debe inducirse con medicamentos o somníferos que creen hábitos. Si tienes dificultades trata otros medios más naturales, consulta un especialista, pero no dependas de las pastillas. Con ciertos cambios apropiados harás mucho más.");
                break;
            case 6:
                animal.setImageResource(R.drawable.tigre);
                signo.setText("Tu signo es: Tigre");
                texto.setText("¡Estás en tu mes, Tigre! Aún estás a tiempo para rectificar un error y regresar junto a la persona amada. Es tu oportunidad para la reconciliación y el arreglo sentimental. No esperes más y llama por teléfono, plantea tu verdad, entrevístate con tu pareja y resuelve todo. Te sigue entrando el dinero y no es momento de derrochar ni malgastar sino de ahorrar e invertirlo de manera adecuada. Lo que hoy hagas inteligentemente con esas entradas adicionales se multiplicarán con creces dentro de algunos meses.");
                break;
            case 7:
                animal.setImageResource(R.drawable.liebre);
                signo.setText("Tu signo es: Liebre");
                texto.setText("El amor es algo real en tu vida, pero requiere tu constancia y apreciación. No te impacientes y podrás conseguir todo lo que te has propuesto. Cada cosa lleva su tiempo y es menester hacerlo con inteligencia para no dejar a medias lo que debía realizarse de manera completa. Te inunda un sentimiento de alegría y tu salud recibe impactos altamente positivos los cuales te permiten la recuperación de trastornos y malestares generales. También te ayudará notablemente a fortalecer tu voluntad.");
                break;
            case 8:
                animal.setImageResource(R.drawable.dragon);
                signo.setText("Tu signo es: Dragon");
                texto.setText("Es hora de tener diversión y alegría en lo que estás haciendo. Si hay una fiesta acude a ella, si tienes pareja hazlo con ella, y si estás solo también porque el amor y el romance hoy están vinculados al relajamiento, la música, la alegría y el bullir de la vida. El consejo que te da un amigo experimentado en cuestiones de negocio será muy valioso a la hora de ayudarte a invertir un dinero y poner en marcha tu economía nuevamente. No te impacientes, aunque ahora estés algo apretado todo mejorará.");
                break;
            case 9:
                animal.setImageResource(R.drawable.serpiente);
                signo.setText("Tu signo es: Serpiente");
                texto.setText("Tienes un ciclo excelente frente a ti, Serpiente, pues en este mes del Tigre te envuelve una nota entusiasta, alegre y decidida. Es un mes adecuado para establecer contactos con otras personas, revisar la prensa, investigar posibilidades de empleo y reorganizar tu vida de modo tal que puedas empezar el próximo mes haciendo el trabajo que más te agrade. Ve preparando las condiciones para un viaje próximo que estás a punto de realizar en los próximos días.");
                break;
            case 10:
                animal.setImageResource(R.drawable.caballo);
                signo.setText("Tu signo es: Caballo");
                texto.setText("Quizás no sepas exactamente lo que deseas en términos sentimentales y estés algo confundido. Antes de comprometerte en una nueva relación explora profundamente tus emociones y consulta con tu Ser Interno. No empeñes tu palabra en algo que no te convenza. Algunas cuestiones económicas podrían parecer muy desventajosas en este mes, pero si las analizas bien te darás cuenta que no es así y encontrarás marcos de referencia y muchas soluciones donde otros solamente ven problemas. Guíate por tu intuición en el amor y no te arrepentirás.");
                break;
            case 11:
                animal.setImageResource(R.drawable.cabra);
                signo.setText("Tu signo es: Cabra");
                texto.setText("En el momento menos pensado te sorprenderán con una invitación sobre todo cuando comience a regir el Año del Gallo de Fuego el día 28 de enero, y tengas cerca de ti a quien te envuelve con un tono alegre y sensual. Descansa lo más posible, pero también haz lo que suele llamarse el descanso activo el cual consiste en hacer algo diferente a tu rutina diaria. Por ejemplo, si tu trabajo es sedentario haz ejercicios, si tu actividad laboral es física, reposa.");
                break;
        }
    }
}
