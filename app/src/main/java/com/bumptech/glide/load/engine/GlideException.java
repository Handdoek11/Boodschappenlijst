package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: x, reason: collision with root package name */
    private static final StackTraceElement[] f12644x = new StackTraceElement[0];

    /* renamed from: o, reason: collision with root package name */
    private final List f12645o;

    /* renamed from: s, reason: collision with root package name */
    private J1.e f12646s;

    /* renamed from: t, reason: collision with root package name */
    private J1.a f12647t;

    /* renamed from: u, reason: collision with root package name */
    private Class f12648u;

    /* renamed from: v, reason: collision with root package name */
    private String f12649v;

    /* renamed from: w, reason: collision with root package name */
    private Exception f12650w;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    private void a(Throwable th, List list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator it = ((GlideException) th).e().iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), list);
        }
    }

    private static void b(List list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static void c(List list, Appendable appendable) {
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            appendable.append("Cause (").append(String.valueOf(i9)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i8);
            if (th instanceof GlideException) {
                ((GlideException) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i8 = i9;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List e() {
        return this.f12645o;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List f8 = f();
        int size = f8.size();
        int i8 = 0;
        while (i8 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i9 = i8 + 1;
            sb.append(i9);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) f8.get(i8));
            i8 = i9;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f12649v);
        sb.append(this.f12648u != null ? ", " + this.f12648u : "");
        sb.append(this.f12647t != null ? ", " + this.f12647t : "");
        sb.append(this.f12646s != null ? ", " + this.f12646s : "");
        List<Throwable> f8 = f();
        if (f8.isEmpty()) {
            return sb.toString();
        }
        if (f8.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(f8.size());
            sb.append(" root causes:");
        }
        for (Throwable th : f8) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    void i(J1.e eVar, J1.a aVar) {
        j(eVar, aVar, null);
    }

    void j(J1.e eVar, J1.a aVar, Class cls) {
        this.f12646s = eVar;
        this.f12647t = aVar;
        this.f12648u = cls;
    }

    public void k(Exception exc) {
        this.f12650w = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public GlideException(String str, List list) {
        this.f12649v = str;
        setStackTrace(f12644x);
        this.f12645o = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    private static final class a implements Appendable {

        /* renamed from: o, reason: collision with root package name */
        private final Appendable f12651o;

        /* renamed from: s, reason: collision with root package name */
        private boolean f12652s = true;

        a(Appendable appendable) {
            this.f12651o = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c8) {
            if (this.f12652s) {
                this.f12652s = false;
                this.f12651o.append("  ");
            }
            this.f12652s = c8 == '\n';
            this.f12651o.append(c8);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence a8 = a(charSequence);
            return append(a8, 0, a8.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i8, int i9) {
            CharSequence a8 = a(charSequence);
            boolean z7 = false;
            if (this.f12652s) {
                this.f12652s = false;
                this.f12651o.append("  ");
            }
            if (a8.length() > 0 && a8.charAt(i9 - 1) == '\n') {
                z7 = true;
            }
            this.f12652s = z7;
            this.f12651o.append(a8, i8, i9);
            return this;
        }
    }
}
