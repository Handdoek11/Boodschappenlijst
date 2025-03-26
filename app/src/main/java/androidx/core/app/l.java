package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.appcompat.app.E;
import androidx.core.app.k;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q.C6398b;

/* loaded from: classes.dex */
class l implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9169a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f9170b;

    /* renamed from: c, reason: collision with root package name */
    private final k.e f9171c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f9172d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f9173e;

    /* renamed from: f, reason: collision with root package name */
    private final List f9174f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f9175g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f9176h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f9177i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static String e(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z7) {
            return builder.setGroupSummary(z7);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z7) {
            return builder.setLocalOnly(z7);
        }

        static Notification.Builder i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i8) {
            return builder.setColor(i8);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i8) {
            return builder.setVisibility(i8);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAllowGeneratedReplies(z7);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setBadgeIconType(i8);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z7) {
            return builder.setColorized(z7);
        }

        static Notification.Builder d(Notification.Builder builder, int i8) {
            return builder.setGroupAlertBehavior(i8);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j8) {
            return builder.setTimeoutAfter(j8);
        }
    }

    static class f {
        static Notification.Action.Builder a(Notification.Action.Builder builder, int i8) {
            return builder.setSemanticAction(i8);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z7) {
            return builder.setAllowSystemGeneratedContextualActions(z7);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z7) {
            return builder.setContextual(z7);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAuthenticationRequired(z7);
        }

        static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setForegroundServiceBehavior(i8);
        }
    }

    l(k.e eVar) {
        int i8;
        this.f9171c = eVar;
        Context context = eVar.f9139a;
        this.f9169a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9170b = e.a(context, eVar.f9128K);
        } else {
            this.f9170b = new Notification.Builder(eVar.f9139a);
        }
        Notification notification = eVar.f9135R;
        this.f9170b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f9147i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f9143e).setContentText(eVar.f9144f).setContentInfo(eVar.f9149k).setContentIntent(eVar.f9145g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f9146h, (notification.flags & 128) != 0).setNumber(eVar.f9150l).setProgress(eVar.f9158t, eVar.f9159u, eVar.f9160v);
        Notification.Builder builder = this.f9170b;
        IconCompat iconCompat = eVar.f9148j;
        c.b(builder, iconCompat == null ? null : iconCompat.m(context));
        this.f9170b.setSubText(eVar.f9155q).setUsesChronometer(eVar.f9153o).setPriority(eVar.f9151m);
        Iterator it = eVar.f9140b.iterator();
        while (it.hasNext()) {
            b((k.a) it.next());
        }
        Bundle bundle = eVar.f9121D;
        if (bundle != null) {
            this.f9175g.putAll(bundle);
        }
        int i9 = Build.VERSION.SDK_INT;
        this.f9172d = eVar.f9125H;
        this.f9173e = eVar.f9126I;
        this.f9170b.setShowWhen(eVar.f9152n);
        a.h(this.f9170b, eVar.f9164z);
        a.f(this.f9170b, eVar.f9161w);
        a.i(this.f9170b, eVar.f9163y);
        a.g(this.f9170b, eVar.f9162x);
        this.f9176h = eVar.f9132O;
        b.b(this.f9170b, eVar.f9120C);
        b.c(this.f9170b, eVar.f9122E);
        b.f(this.f9170b, eVar.f9123F);
        b.d(this.f9170b, eVar.f9124G);
        b.e(this.f9170b, notification.sound, notification.audioAttributes);
        List e8 = i9 < 28 ? e(g(eVar.f9141c), eVar.f9138U) : eVar.f9138U;
        if (e8 != null && !e8.isEmpty()) {
            Iterator it2 = e8.iterator();
            while (it2.hasNext()) {
                b.a(this.f9170b, (String) it2.next());
            }
        }
        this.f9177i = eVar.f9127J;
        if (eVar.f9142d.size() > 0) {
            Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i10 = 0; i10 < eVar.f9142d.size(); i10++) {
                bundle4.putBundle(Integer.toString(i10), m.a((k.a) eVar.f9142d.get(i10)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f9175g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = eVar.f9137T;
        if (obj != null) {
            c.c(this.f9170b, obj);
        }
        if (i11 >= 24) {
            this.f9170b.setExtras(eVar.f9121D);
            d.e(this.f9170b, eVar.f9157s);
            RemoteViews remoteViews = eVar.f9125H;
            if (remoteViews != null) {
                d.c(this.f9170b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f9126I;
            if (remoteViews2 != null) {
                d.b(this.f9170b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f9127J;
            if (remoteViews3 != null) {
                d.d(this.f9170b, remoteViews3);
            }
        }
        if (i11 >= 26) {
            e.b(this.f9170b, eVar.f9129L);
            e.e(this.f9170b, eVar.f9156r);
            e.f(this.f9170b, eVar.f9130M);
            e.g(this.f9170b, eVar.f9131N);
            e.d(this.f9170b, eVar.f9132O);
            if (eVar.f9119B) {
                e.c(this.f9170b, eVar.f9118A);
            }
            if (!TextUtils.isEmpty(eVar.f9128K)) {
                this.f9170b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i11 >= 28) {
            Iterator it3 = eVar.f9141c.iterator();
            if (it3.hasNext()) {
                E.a(it3.next());
                throw null;
            }
        }
        if (i11 >= 29) {
            g.a(this.f9170b, eVar.f9134Q);
            g.b(this.f9170b, k.d.a(null));
        }
        if (i11 >= 31 && (i8 = eVar.f9133P) != 0) {
            h.b(this.f9170b, i8);
        }
        if (eVar.f9136S) {
            if (this.f9171c.f9162x) {
                this.f9176h = 2;
            } else {
                this.f9176h = 1;
            }
            this.f9170b.setVibrate(null);
            this.f9170b.setSound(null);
            int i12 = notification.defaults & (-4);
            notification.defaults = i12;
            this.f9170b.setDefaults(i12);
            if (i11 >= 26) {
                if (TextUtils.isEmpty(this.f9171c.f9161w)) {
                    a.f(this.f9170b, "silent");
                }
                e.d(this.f9170b, this.f9176h);
            }
        }
    }

    private void b(k.a aVar) {
        IconCompat d8 = aVar.d();
        Notification.Action.Builder a8 = c.a(d8 != null ? d8.l() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : r.b(aVar.e())) {
                a.c(a8, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            d.a(a8, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i8 >= 28) {
            f.a(a8, aVar.f());
        }
        if (i8 >= 29) {
            g.c(a8, aVar.j());
        }
        if (i8 >= 31) {
            h.a(a8, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(a8, bundle);
        a.a(this.f9170b, a.d(a8));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C6398b c6398b = new C6398b(list.size() + list2.size());
        c6398b.addAll(list);
        c6398b.addAll(list2);
        return new ArrayList(c6398b);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        E.a(it.next());
        throw null;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.j
    public Notification.Builder a() {
        return this.f9170b;
    }

    public Notification c() {
        Bundle a8;
        RemoteViews f8;
        RemoteViews d8;
        k.f fVar = this.f9171c.f9154p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e8 = fVar != null ? fVar.e(this) : null;
        Notification d9 = d();
        if (e8 != null) {
            d9.contentView = e8;
        } else {
            RemoteViews remoteViews = this.f9171c.f9125H;
            if (remoteViews != null) {
                d9.contentView = remoteViews;
            }
        }
        if (fVar != null && (d8 = fVar.d(this)) != null) {
            d9.bigContentView = d8;
        }
        if (fVar != null && (f8 = this.f9171c.f9154p.f(this)) != null) {
            d9.headsUpContentView = f8;
        }
        if (fVar != null && (a8 = k.a(d9)) != null) {
            fVar.a(a8);
        }
        return d9;
    }

    protected Notification d() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            return this.f9170b.build();
        }
        if (i8 >= 24) {
            Notification build = this.f9170b.build();
            if (this.f9176h != 0) {
                if (a.e(build) != null && (build.flags & 512) != 0 && this.f9176h == 2) {
                    h(build);
                }
                if (a.e(build) != null && (build.flags & 512) == 0 && this.f9176h == 1) {
                    h(build);
                }
            }
            return build;
        }
        this.f9170b.setExtras(this.f9175g);
        Notification build2 = this.f9170b.build();
        RemoteViews remoteViews = this.f9172d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f9173e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f9177i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.f9176h != 0) {
            if (a.e(build2) != null && (build2.flags & 512) != 0 && this.f9176h == 2) {
                h(build2);
            }
            if (a.e(build2) != null && (build2.flags & 512) == 0 && this.f9176h == 1) {
                h(build2);
            }
        }
        return build2;
    }

    Context f() {
        return this.f9169a;
    }
}
