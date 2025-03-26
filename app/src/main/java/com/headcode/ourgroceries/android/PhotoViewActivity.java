package com.headcode.ourgroceries.android;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.appcompat.app.AbstractC0832a;
import com.github.chrisbanes.photoview.PhotoView;
import f2.InterfaceC5772h;
import j1.C6051a;
import n5.C6263m;
import o0.AbstractC6278a;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public class PhotoViewActivity extends AbstractActivityC5575j2 {
    public static C6051a A1(Context context) {
        C6051a c6051a = new C6051a(context);
        c6051a.g(P1.i(46));
        c6051a.d(P1.i(80));
        c6051a.e(AbstractC6278a.c(context, E2.f33378B), AbstractC6278a.c(context, E2.f33381E), AbstractC6278a.c(context, E2.f33380D));
        c6051a.start();
        return c6051a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean B1(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        int M7 = P1.M((int) f8);
        int M8 = P1.M((int) f9);
        if (M8 < 0 || M7 > M8 || M7 < (-M8) || M8 < 1000) {
            return false;
        }
        finish();
        return true;
    }

    private PhotoView z1(PhotoView photoView) {
        photoView.setOnSingleFlingListener(new InterfaceC5772h() { // from class: com.headcode.ourgroceries.android.u2
            @Override // f2.InterfaceC5772h
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
                return this.f35044a.B1(motionEvent, motionEvent2, f8, f9);
            }
        });
        return photoView;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        AbstractC0832a supportActionBar;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.Value");
        String stringExtra2 = getIntent().getStringExtra("com.headcode.ourgroceries.Note");
        String stringExtra3 = getIntent().getStringExtra("com.headcode.ourgroceries.PhotoID");
        C6263m c8 = C6263m.c(getLayoutInflater());
        setContentView(c8.b());
        L0();
        setTitle(stringExtra);
        if (!AbstractC6803e.o(stringExtra2) && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.x(stringExtra2);
        }
        ((com.bumptech.glide.j) ((com.bumptech.glide.j) AbstractC5648t2.c(this, stringExtra3).a0(A1(this))).l(G2.f33455c)).A0(z1(c8.f39703c));
    }
}
