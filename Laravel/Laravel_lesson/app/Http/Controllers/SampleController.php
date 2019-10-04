<?php

namespace App\Http\Controllers;

use App\Models\Frameworks;

class SampleController extends Controller
{
    public function model($type=null)
    {
        $md = new Frameworks();
        
        $data = $md->getData($type);
        
        return view('sample.model',['data'=>$data]);
    }
}
