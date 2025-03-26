package p2;

import h2.InterfaceC5837k;
import j2.AbstractC6060i;
import j2.AbstractC6067p;
import j2.u;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k2.m;
import q2.x;
import r2.InterfaceC6662d;
import s2.InterfaceC6723a;

/* renamed from: p2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6324c implements InterfaceC6326e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f40134f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f40135a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f40136b;

    /* renamed from: c, reason: collision with root package name */
    private final k2.e f40137c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6662d f40138d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6723a f40139e;

    public C6324c(Executor executor, k2.e eVar, x xVar, InterfaceC6662d interfaceC6662d, InterfaceC6723a interfaceC6723a) {
        this.f40136b = executor;
        this.f40137c = eVar;
        this.f40135a = xVar;
        this.f40138d = interfaceC6662d;
        this.f40139e = interfaceC6723a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(AbstractC6067p abstractC6067p, AbstractC6060i abstractC6060i) {
        this.f40138d.n0(abstractC6067p, abstractC6060i);
        this.f40135a.b(abstractC6067p, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final AbstractC6067p abstractC6067p, InterfaceC5837k interfaceC5837k, AbstractC6060i abstractC6060i) {
        try {
            m e8 = this.f40137c.e(abstractC6067p.b());
            if (e8 == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC6067p.b());
                f40134f.warning(format);
                interfaceC5837k.a(new IllegalArgumentException(format));
            } else {
                final AbstractC6060i b8 = e8.b(abstractC6060i);
                this.f40139e.d(new InterfaceC6723a.InterfaceC0328a() { // from class: p2.b
                    @Override // s2.InterfaceC6723a.InterfaceC0328a
                    public final Object a() {
                        return this.f40131a.d(abstractC6067p, b8);
                    }
                });
                interfaceC5837k.a(null);
            }
        } catch (Exception e9) {
            f40134f.warning("Error scheduling event " + e9.getMessage());
            interfaceC5837k.a(e9);
        }
    }

    @Override // p2.InterfaceC6326e
    public void a(final AbstractC6067p abstractC6067p, final AbstractC6060i abstractC6060i, final InterfaceC5837k interfaceC5837k) {
        this.f40136b.execute(new Runnable() { // from class: p2.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f40127o.e(abstractC6067p, interfaceC5837k, abstractC6060i);
            }
        });
    }
}
