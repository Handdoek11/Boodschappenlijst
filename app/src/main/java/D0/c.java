package D0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: A, reason: collision with root package name */
    private int f1131A;

    /* renamed from: B, reason: collision with root package name */
    private LayoutInflater f1132B;

    /* renamed from: z, reason: collision with root package name */
    private int f1133z;

    public c(Context context, int i8, Cursor cursor, boolean z7) {
        super(context, cursor, z7);
        this.f1131A = i8;
        this.f1133z = i8;
        this.f1132B = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // D0.a
    public View q(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1132B.inflate(this.f1131A, viewGroup, false);
    }

    @Override // D0.a
    public View r(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1132B.inflate(this.f1133z, viewGroup, false);
    }
}
