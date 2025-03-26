package R4;

import J6.AbstractC0650j;
import S4.b;
import U6.AbstractC0723k;
import U6.InterfaceC0745v0;
import U6.M;
import U6.N;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import x6.C6916E;
import y6.AbstractC6987o;
import z6.AbstractC7088a;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: f, reason: collision with root package name */
    public static final b f4792f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final A6.g f4793a;

    /* renamed from: b, reason: collision with root package name */
    private Messenger f4794b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4795c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingDeque f4796d;

    /* renamed from: e, reason: collision with root package name */
    private final d f4797e;

    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final A6.g f4798a;

        /* renamed from: R4.D$a$a, reason: collision with other inner class name */
        static final class C0094a extends kotlin.coroutines.jvm.internal.l implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            int f4799o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ String f4800s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0094a(String str, A6.d dVar) {
                super(2, dVar);
                this.f4800s = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return new C0094a(this.f4800s, dVar);
            }

            @Override // I6.p
            public final Object invoke(M m8, A6.d dVar) {
                return ((C0094a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f4799o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    S4.a aVar = S4.a.f5111a;
                    this.f4799o = 1;
                    obj = aVar.c(this);
                    if (obj == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x6.q.b(obj);
                }
                Collection<S4.b> values = ((Map) obj).values();
                String str = this.f4800s;
                for (S4.b bVar : values) {
                    bVar.a(new b.C0102b(str));
                    Log.d("SessionLifecycleClient", "Notified " + bVar.c() + " of new session " + str);
                }
                return C6916E.f44463a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(A6.g gVar) {
            super(Looper.getMainLooper());
            J6.r.e(gVar, "backgroundDispatcher");
            this.f4798a = gVar;
        }

        private final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received.");
            AbstractC0723k.d(N.a(this.f4798a), null, null, new C0094a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            J6.r.e(message, "msg");
            if (message.what == 3) {
                Bundle data = message.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        int f4801o;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f4803t;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC7088a.a(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, A6.d dVar) {
            super(2, dVar);
            this.f4803t = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            return D.this.new c(this.f4803t, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f4801o;
            if (i8 == 0) {
                x6.q.b(obj);
                S4.a aVar = S4.a.f5111a;
                this.f4801o = 1;
                obj = aVar.c(this);
                if (obj == e8) {
                    return e8;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x6.q.b(obj);
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection values = map.values();
                if ((values instanceof Collection) && values.isEmpty()) {
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                } else {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((S4.b) it.next()).b()) {
                            List U7 = AbstractC6987o.U(AbstractC6987o.y(AbstractC6987o.h(D.this.l(this.f4803t, 2), D.this.l(this.f4803t, 1))), new a());
                            D d8 = D.this;
                            Iterator it2 = U7.iterator();
                            while (it2.hasNext()) {
                                d8.p((Message) it2.next());
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
            }
            return C6916E.f44463a;
        }
    }

    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + D.this.f4796d.size());
            D.this.f4794b = new Messenger(iBinder);
            D.this.f4795c = true;
            D d8 = D.this;
            d8.o(d8.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            D.this.f4794b = null;
            D.this.f4795c = false;
        }
    }

    public D(A6.g gVar) {
        J6.r.e(gVar, "backgroundDispatcher");
        this.f4793a = gVar;
        this.f4796d = new LinkedBlockingDeque(20);
        this.f4797e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List j() {
        ArrayList arrayList = new ArrayList();
        this.f4796d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message l(List list, int i8) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i8) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    private final void m(Message message) {
        if (!this.f4796d.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.f4796d.size());
    }

    private final void n(int i8) {
        List j8 = j();
        Message obtain = Message.obtain(null, i8, 0, 0);
        J6.r.d(obtain, "obtain(null, messageCode, 0, 0)");
        j8.add(obtain);
        o(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0745v0 o(List list) {
        return AbstractC0723k.d(N.a(this.f4793a), null, null, new c(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Message message) {
        if (this.f4794b == null) {
            m(message);
            return;
        }
        try {
            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
            Messenger messenger = this.f4794b;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e8) {
            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e8);
            m(message);
        }
    }

    public final void h() {
        n(2);
    }

    public final void i(F f8) {
        J6.r.e(f8, "sessionLifecycleServiceBinder");
        f8.a(new Messenger(new a(this.f4793a)), this.f4797e);
    }

    public final void k() {
        n(1);
    }
}
