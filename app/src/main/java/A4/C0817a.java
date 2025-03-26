package a4;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p3.AbstractC6353m0;
import p3.AbstractC6368u0;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0817a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6540a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6541b;

    /* renamed from: a4.a$a, reason: collision with other inner class name */
    public static class C0130a {

        /* renamed from: b, reason: collision with root package name */
        private final Context f6543b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f6545d;

        /* renamed from: a, reason: collision with root package name */
        private final List f6542a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private int f6544c = 0;

        public C0130a(Context context) {
            this.f6543b = context.getApplicationContext();
        }

        public C0817a a() {
            boolean z7 = true;
            if (!AbstractC6368u0.a(true) && !this.f6542a.contains(AbstractC6353m0.a(this.f6543b)) && !this.f6545d) {
                z7 = false;
            }
            return new C0817a(z7, this, null);
        }
    }

    /* synthetic */ C0817a(boolean z7, C0130a c0130a, g gVar) {
        this.f6540a = z7;
        this.f6541b = c0130a.f6544c;
    }

    public int a() {
        return this.f6541b;
    }

    public boolean b() {
        return this.f6540a;
    }
}
