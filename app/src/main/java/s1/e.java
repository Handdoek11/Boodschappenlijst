package s1;

import android.app.Notification;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f42679a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42680b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f42681c;

    public e(int i8, Notification notification, int i9) {
        this.f42679a = i8;
        this.f42681c = notification;
        this.f42680b = i9;
    }

    public int a() {
        return this.f42680b;
    }

    public Notification b() {
        return this.f42681c;
    }

    public int c() {
        return this.f42679a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f42679a == eVar.f42679a && this.f42680b == eVar.f42680b) {
            return this.f42681c.equals(eVar.f42681c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f42679a * 31) + this.f42680b) * 31) + this.f42681c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f42679a + ", mForegroundServiceType=" + this.f42680b + ", mNotification=" + this.f42681c + '}';
    }
}
