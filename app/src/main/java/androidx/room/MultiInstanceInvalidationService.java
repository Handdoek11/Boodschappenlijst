package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.c;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: o, reason: collision with root package name */
    int f11287o = 0;

    /* renamed from: s, reason: collision with root package name */
    final HashMap f11288s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    final RemoteCallbackList f11289t = new a();

    /* renamed from: u, reason: collision with root package name */
    private final c.a f11290u = new b();

    class a extends RemoteCallbackList {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.b bVar, Object obj) {
            HashMap hashMap = MultiInstanceInvalidationService.this.f11288s;
            Integer num = (Integer) obj;
            num.intValue();
            hashMap.remove(num);
        }
    }

    class b extends c.a {
        b() {
        }

        @Override // androidx.room.c
        public void X6(androidx.room.b bVar, int i8) {
            synchronized (MultiInstanceInvalidationService.this.f11289t) {
                MultiInstanceInvalidationService.this.f11289t.unregister(bVar);
                MultiInstanceInvalidationService.this.f11288s.remove(Integer.valueOf(i8));
            }
        }

        @Override // androidx.room.c
        public int t2(androidx.room.b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f11289t) {
                try {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    int i8 = multiInstanceInvalidationService.f11287o + 1;
                    multiInstanceInvalidationService.f11287o = i8;
                    if (multiInstanceInvalidationService.f11289t.register(bVar, Integer.valueOf(i8))) {
                        MultiInstanceInvalidationService.this.f11288s.put(Integer.valueOf(i8), str);
                        return i8;
                    }
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                    multiInstanceInvalidationService2.f11287o--;
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.room.c
        public void z6(int i8, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f11289t) {
                try {
                    String str = (String) MultiInstanceInvalidationService.this.f11288s.get(Integer.valueOf(i8));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int beginBroadcast = MultiInstanceInvalidationService.this.f11289t.beginBroadcast();
                    for (int i9 = 0; i9 < beginBroadcast; i9++) {
                        try {
                            Integer num = (Integer) MultiInstanceInvalidationService.this.f11289t.getBroadcastCookie(i9);
                            int intValue = num.intValue();
                            String str2 = (String) MultiInstanceInvalidationService.this.f11288s.get(num);
                            if (i8 != intValue && str.equals(str2)) {
                                try {
                                    ((androidx.room.b) MultiInstanceInvalidationService.this.f11289t.getBroadcastItem(i9)).G1(strArr);
                                } catch (RemoteException e8) {
                                    Log.w("ROOM", "Error invoking a remote callback", e8);
                                }
                            }
                        } finally {
                            MultiInstanceInvalidationService.this.f11289t.finishBroadcast();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f11290u;
    }
}
