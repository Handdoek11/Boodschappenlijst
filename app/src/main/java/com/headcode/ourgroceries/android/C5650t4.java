package com.headcode.ourgroceries.android;

import android.content.Context;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import java.util.LinkedList;
import java.util.Queue;
import q5.AbstractC6635a;

/* renamed from: com.headcode.ourgroceries.android.t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5650t4 {

    /* renamed from: b, reason: collision with root package name */
    private final Context f35023b;

    /* renamed from: c, reason: collision with root package name */
    private TextToSpeech f35024c;

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f35022a = new a();

    /* renamed from: d, reason: collision with root package name */
    private c f35025d = c.OFF;

    /* renamed from: e, reason: collision with root package name */
    private final Queue f35026e = new LinkedList();

    /* renamed from: f, reason: collision with root package name */
    private final Handler f35027f = OurApplication.j();

    /* renamed from: com.headcode.ourgroceries.android.t4$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5650t4.this.j();
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.t4$b */
    class b implements TextToSpeech.OnInitListener {

        /* renamed from: com.headcode.ourgroceries.android.t4$b$a */
        class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ int f35030o;

            a(int i8) {
                this.f35030o = i8;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f35030o == 0) {
                    C5650t4.this.f35025d = c.RUNNING;
                    C5650t4.this.g();
                } else {
                    C5650t4.this.f35025d = c.PROBLEM;
                    AbstractC6635a.f("OG-Speaker", "Could not start text-to-speech engine");
                    C5650t4.this.f35024c = null;
                }
            }
        }

        b() {
        }

        @Override // android.speech.tts.TextToSpeech.OnInitListener
        public void onInit(int i8) {
            C5650t4.this.f35027f.post(new a(i8));
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.t4$c */
    private enum c {
        OFF,
        STARTING,
        RUNNING,
        PROBLEM
    }

    public C5650t4(Context context) {
        this.f35023b = context;
    }

    private void f() {
        this.f35027f.removeCallbacks(this.f35022a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f35025d != c.RUNNING) {
            return;
        }
        while (true) {
            String str = (String) this.f35026e.poll();
            if (str == null) {
                h();
                return;
            }
            this.f35024c.speak(str, 1, null);
        }
    }

    private void h() {
        f();
        this.f35027f.postDelayed(this.f35022a, 60000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        AbstractC6635a.a("OG-Speaker", "Shutting down text-to-speech engine");
        f();
        TextToSpeech textToSpeech = this.f35024c;
        if (textToSpeech != null) {
            textToSpeech.stop();
            this.f35024c.shutdown();
            this.f35024c = null;
        }
        if (this.f35025d != c.PROBLEM) {
            this.f35025d = c.OFF;
        }
    }

    public void i(String str) {
        int ordinal = this.f35025d.ordinal();
        if (ordinal == 0) {
            this.f35026e.add(str);
            this.f35025d = c.STARTING;
            AbstractC6635a.a("OG-Speaker", "Starting text-to-speech engine");
            this.f35024c = new TextToSpeech(this.f35023b, new b());
            return;
        }
        if (ordinal == 1 || ordinal == 2) {
            this.f35026e.add(str);
            g();
        }
    }
}
