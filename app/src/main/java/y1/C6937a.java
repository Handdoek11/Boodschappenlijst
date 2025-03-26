package y1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import s1.j;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6937a extends AbstractC6939c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f44530i = j.f("BatteryChrgTracker");

    public C6937a(Context context, C1.a aVar) {
        super(context, aVar);
    }

    private boolean j(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // y1.AbstractC6939c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // y1.AbstractC6939c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            r6 = 1
            r0 = 0
            java.lang.String r7 = r7.getAction()
            if (r7 != 0) goto L9
            return
        L9:
            s1.j r1 = s1.j.c()
            java.lang.String r2 = y1.C6937a.f44530i
            java.lang.String r3 = "Received %s"
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r0] = r7
            java.lang.String r3 = java.lang.String.format(r3, r4)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r0]
            r1.a(r2, r3, r4)
            r1 = -1
            int r2 = r7.hashCode()
            switch(r2) {
                case -1886648615: goto L47;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L26;
            }
        L26:
            r6 = r1
            goto L51
        L28:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L31
            goto L26
        L31:
            r6 = 3
            goto L51
        L33:
            java.lang.String r6 = "android.os.action.CHARGING"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L3c
            goto L26
        L3c:
            r6 = 2
            goto L51
        L3e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L51
            goto L26
        L47:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L50
            goto L26
        L50:
            r6 = r0
        L51:
            switch(r6) {
                case 0: goto L67;
                case 1: goto L61;
                case 2: goto L5b;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L6c
        L55:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.d(r6)
            goto L6c
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.d(r6)
            goto L6c
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.d(r6)
            goto L6c
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.d(r6)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.C6937a.h(android.content.Context, android.content.Intent):void");
    }

    @Override // y1.AbstractC6940d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent registerReceiver = this.f44537b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(j(registerReceiver));
        }
        j.c().b(f44530i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
